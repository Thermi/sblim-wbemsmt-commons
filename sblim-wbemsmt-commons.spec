%define name                    sblim-wbemsmt-commons
%define version                 0.2.3
%define build_release           1
%define release                 %{build_release}jpp
%define section                 free

###############################################################################

Name:           %{name}
Version:        %{version}
Release:        %{release}
License:        Common Public License
Url:            http://sblim.sourceforge.net/
Group:          Development/Libraries/Java
Vendor:         IBM
Summary:        Base module containing common classes used by all wbemsmt tasks
SOURCE0:        %{name}-%{version}-src.tar.bz2
BuildRoot:      %{_tmppath}/%{name}-%{version}-%{release}
BuildArch:      noarch

BuildRequires: jpackage-utils >= 0:1.5.32
BuildRequires: ant >= 0:1.6
BuildRequires: sblim-cim-client >= 0:1.3.1
BuildRequires: tomcat5-servlet-2.4-api >= 5.5.15
BuildRequires: jakarta-commons-cli >= 1.0
BuildRequires: jakarta-commons-lang >= 2.0
BuildRequires: jakarta-commons-collections >= 3.1
#BuildRequires:  myfaces >= 1.1.4
#BuildRequires:  tomahawk >= 1.1.3
#BuildRequires:  xmlBeans >= 2.2.0
#BuildRequires:  jsr173-1.0-api >= 1.0?

###############################################################################

Requires: jpackage-utils >= 0:1.5.32
Requires: sblim-cim-client >= 0:1.3.1
Requires: tomcat5-servlet-2.4-api >= 5.5.15
Requires: jakarta-commons-cli >= 1.0
Requires: jakarta-commons-collections >= 3.1
Requires: jakarta-commons-lang >= 2.0
#Requires:  myfaces >= 1.1.4
#Requires:  tomahawk >= 1.1.3
#Requires:  xmlBeans >= 2.2.0
#Requires:  jsr173-1.0-api >= 1.0?

###############################################################################

%description
This is the base module for all the wbemsmt client sided packages and contains
common classes used by the wbemsmt tasks.
It contains utility classes for creating and executing wizards, tools for cli
and jsf handling and Helper classes for cim communication.
It has the generated CIM 2.9 schema and common classes for the task launcher.

###############################################################################

%prep
%setup -q -n %{name}

###############################################################################

%build
CLASSPATH=$(build-classpath sblim-cim-client sblim-slp-client)
CLASSPATH=$(build-classpath tomcat5-servlet-2.4-api):$CLASSPATH
CLASSPATH=$(build-classpath commons-cli commons-collections commons-lang):$CLASSPATH
CLASSPATH=$(build-classpath xbean jsr173_1.0_api myfaces-api myfaces-impl tomahawk):$CLASSPATH
export CLASSPATH

ant build-jar


###############################################################################

%install
rm -rf $RPM_BUILD_ROOT
install -d $RPM_BUILD_ROOT%{_sysconfdir}/sblim-wbemsmt
install -d $RPM_BUILD_ROOT%{_sysconfdir}/java/sblim-wbemsmt
install -d $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt
install -d $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}

# Installation of documentation files
install COPYING   $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/COPYING
install AUTHORS   $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/AUTHORS
install README    $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/README
install ChangeLog $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/ChangeLog
install NEWS      $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/NEWS

# Installation of config files
install target/package/etc/java/sblim-wbemsmt/cmdlogging.properties $RPM_BUILD_ROOT%{_sysconfdir}/java/sblim-wbemsmt/logging-cmd.properties
install target/package/etc/java/sblim-wbemsmt/logging.properties $RPM_BUILD_ROOT%{_sysconfdir}/java/sblim-wbemsmt/logging.properties
install target/package/etc/sblim-wbemsmt/tasklauncher-config.xml $RPM_BUILD_ROOT%{_sysconfdir}/sblim-wbemsmt/tasklauncher-config.xml

# Installation of java files
install target/package/%{name}-%{version}.jar                 $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt
install target/package/%{name}-launcher-config-%{version}.jar $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt
(
  cd $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt &&
    ln -sf %{name}-%{version}.jar %{name}.jar;
    ln -sf %{name}-launcher-config-%{version}.jar %{name}-launcher-config.jar;
)

###############################################################################

%files
%defattr(0644,root,root,0755)
%doc %{_docdir}/%{name}-%{version}/COPYING
%doc %{_docdir}/%{name}-%{version}/AUTHORS
%doc %{_docdir}/%{name}-%{version}/README
%doc %{_docdir}/%{name}-%{version}/ChangeLog
%doc %{_docdir}/%{name}-%{version}/NEWS
%attr(664,root,tomcat) %config(noreplace) %{_sysconfdir}/java/sblim-wbemsmt/logging-cmd.properties
%attr(664,root,tomcat) %config(noreplace) %{_sysconfdir}/java/sblim-wbemsmt/logging.properties
%attr(664,root,tomcat) %config(noreplace) %{_sysconfdir}/sblim-wbemsmt/tasklauncher-config.xml
%{_javadir}/sblim-wbemsmt/%{name}.jar
%{_javadir}/sblim-wbemsmt/%{name}-%{version}.jar
%{_javadir}/sblim-wbemsmt/%{name}-launcher-config.jar
%{_javadir}/sblim-wbemsmt/%{name}-launcher-config-%{version}.jar

###############################################################################
%changelog
* Mon Dec 4 2006 Wolfgang Taphorn <taphorn@de.ibm.com> 0.2.3-1
  - Consolidation of the different cvs modules
  - Inclusion of fixes for the following bug entries:
    o 1609086 wbemsmt-commons: Consolidation of cvs modules
    o 1609082 wbemsmt-commons: Functional enhancements

* Tue Oct 17 2006 Wolfgang Taphorn <taphorn@de.ibm.com> 0.2.2-1
  Changelog information out of the distributed cvs modules
  - Inclusion of fixes for the following bug entries:
    o 1572076 Missing Validation Messages
    o 1573713 WizardPanels are vanishing
    o 1573746 Preset handling for Login
    o 1574472 Cleanup for client projects

* Sat Jul 22 2006 Wolfgang Taphorn <taphorn@de.ibm.com> 0.2.1-1
  - Initial upload of distributed CVS modules
