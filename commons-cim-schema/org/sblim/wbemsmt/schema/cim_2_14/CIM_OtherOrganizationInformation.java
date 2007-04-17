/** 
 * CIM_OtherOrganizationInformation.java
 *
 * (C) Copyright IBM Corp. 2005
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author:	ECCG 0.9.7 generated 
 * 			(author should be changed, e.g. First and Last Name <xxx@cc.ibm.com>)
 *
 * Contributors:
 *
 *
 * Description:  The OtherOrganizationInformation class is used to provide additional
 * information about an associated Organization instance. This class is defined
 * so as to incorporate commonly-used LDAP attributes to permit implementations
 * to easily derive this information from LDAP-accessible directories.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  The OtherOrganizationInformation class is used to provide additional
 * information about an associated Organization instance. This class is defined
 * so as to incorporate commonly-used LDAP attributes to permit implementations
 * to easily derive this information from LDAP-accessible directories.
 */
public class CIM_OtherOrganizationInformation extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_OtherOrganizationInformation"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREORGANIZATIONINFO = "CIM_MoreOrganizationInfo"; //$NON-NLS-1$
	
	
	/**
	*	This property describes the kind of business performed by an organization.
	*/
	public final static String CIM_PROPERTY_BUSINESSCATEGORY = "BusinessCategory"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The Descriptions property values may contain human-readable descriptions of the object. In the case of an LDAP-derived instance, the description attribute may have multiple values that, therefore, cannot be placed in the inherited Description property.
	*/
	public final static String CIM_PROPERTY_DESCRIPTIONS = "Descriptions"; //$NON-NLS-1$
	/**
	*	This property is used for the organization's telegram service.
	*/
	public final static String CIM_PROPERTY_DESTINATIONINDICATOR = "DestinationIndicator"; //$NON-NLS-1$
	/**
	*	The organization's facsimile telephone number.
	*/
	public final static String CIM_PROPERTY_FACSIMILETELEPHONENUMBER = "FacsimileTelephoneNumber"; //$NON-NLS-1$
	/**
	*	The organization's International ISDN number.
	*/
	public final static String CIM_PROPERTY_INTERNATIONALISDNNUMBER = "InternationaliSDNNumber"; //$NON-NLS-1$
	/**
	*	Uniform Resource Identifier with optional label as defined in RFC2079.
	*/
	public final static String CIM_PROPERTY_LABELEDURI = "LabeledURI"; //$NON-NLS-1$
	/**
	*	This property contains the name of a locality, such as a city, county or other geographic region.
	*/
	public final static String CIM_PROPERTY_LOCALITYNAME = "LocalityName"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the mail box addresses for the organization as defined in RFC822.
	*/
	public final static String CIM_PROPERTY_MAIL = "Mail"; //$NON-NLS-1$
	/**
	*	The manager for the organization. In the case of an LDAP-derived instance, the Manager property value may contain the distinguished name of the Manager.
	*/
	public final static String CIM_PROPERTY_MANAGER = "Manager"; //$NON-NLS-1$
	/**
	*	The Name property defines the label by which the object is known. In the case of an LDAP-derived instance, the Name property value may be set to the distinguished name of the LDAP-accessed object instance.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	In the case of an LDAP-derived instance, the ObjectClass property value(s) may be set to the objectClass attribute values.
	*/
	public final static String CIM_PROPERTY_OBJECTCLASS = "ObjectClass"; //$NON-NLS-1$
	/**
	*	The name of the organization.
	*/
	public final static String CIM_PROPERTY_ORGANIZATIONNAME = "OrganizationName"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, this property may be used for electronic mail box addresses other than RFC822 and X.400.
	*/
	public final static String CIM_PROPERTY_OTHERMAILBOX = "OtherMailbox"; //$NON-NLS-1$
	/**
	*	The PhysicalDeliveryOfficeName property specifies the name of the city, village, etc. where a physical delivery office is situated.
	*/
	public final static String CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME = "PhysicalDeliveryOfficeName"; //$NON-NLS-1$
	/**
	*	The PostOfficeBox property specifies the PO box by which the organization will receive physical postal delivery. If present, the property value is part of the object's postal address.
	*/
	public final static String CIM_PROPERTY_POSTOFFICEBOX = "PostOfficeBox"; //$NON-NLS-1$
	/**
	*	The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the organization.
	*/
	public final static String CIM_PROPERTY_POSTALADDRESS = "PostalAddress"; //$NON-NLS-1$
	/**
	*	The PostalCode property specifies the postal code of the organization. If this value is present it will be part of the object's postal address.
	*/
	public final static String CIM_PROPERTY_POSTALCODE = "PostalCode"; //$NON-NLS-1$
	/**
	*	The PreferredDeliveryMethod property specifies the organization's preferred method to be used for communicating with it.
	*/
	public final static String CIM_PROPERTY_PREFERREDDELIVERYMETHOD = "PreferredDeliveryMethod"; //$NON-NLS-1$
	/**
	*	This property specifies a postal address suitable for receipt of telegrams or expedited documents, where it is necessary to have the recipient accept delivery.
	*/
	public final static String CIM_PROPERTY_REGISTEREDADDRESS = "RegisteredAddress"; //$NON-NLS-1$
	/**
	*	This property value is for use by X.500 clients in constructing search filters.
	*/
	public final static String CIM_PROPERTY_SEARCHGUIDE = "SearchGuide"; //$NON-NLS-1$
	/**
	*	In the case of an LDAP-derived instance, the SeeAlso property specifies distinguishedName of other Directory objects which may be other aspects (in some sense) of the same real world object.
	*/
	public final static String CIM_PROPERTY_SEEALSO = "SeeAlso"; //$NON-NLS-1$
	/**
	*	The State or Province name property specifies a state or province.
	*/
	public final static String CIM_PROPERTY_STATEORPROVINCE = "StateOrProvince"; //$NON-NLS-1$
	/**
	*	The Street address property specifies a site for the local distribution and physical delivery in a postal address, i.e. the street name, place, avenue, and the number.
	*/
	public final static String CIM_PROPERTY_STREET = "Street"; //$NON-NLS-1$
	/**
	*	The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	*/
	public final static String CIM_PROPERTY_TELEPHONENUMBER = "TelephoneNumber"; //$NON-NLS-1$
	/**
	*	The TeletexTerminalIdentifier property specifies the Teletex terminal identifier (and, optionally, parameters) for a teletex terminal associated with the organization.
	*/
	public final static String CIM_PROPERTY_TELETEXTERMINALIDENTIFIER = "TeletexTerminalIdentifier"; //$NON-NLS-1$
	/**
	*	The TelexNumber property specifies the telex number, country code, and answerback code of a telex terminal for the organization.
	*/
	public final static String CIM_PROPERTY_TELEXNUMBER = "TelexNumber"; //$NON-NLS-1$
	/**
	*	An image of the organization logo.
	*/
	public final static String CIM_PROPERTY_THUMBNAILLOGO = "ThumbnailLogo"; //$NON-NLS-1$
	/**
	*	A unique identifier that may be assigned in an environment to differentiate between uses of a given named organization instance.
	*/
	public final static String CIM_PROPERTY_UNIQUEIDENTIFIER = "UniqueIdentifier"; //$NON-NLS-1$
	/**
	*	In the case of an LDAP-derived instance, the UserPassword property may contain an encrypted password used to access the organization's resources in a directory.
	*/
	public final static String CIM_PROPERTY_USERPASSWORD = "UserPassword"; //$NON-NLS-1$
	/**
	*	An X.121 address for the organization.
	*/
	public final static String CIM_PROPERTY_X121ADDRESS = "X121Address"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BUSINESSCATEGORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONINDICATOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNATIONALISDNNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LABELEDURI);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALITYNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAIL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MANAGER);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OBJECTCLASS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ORGANIZATIONNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERMAILBOX);
		CIM_PropertyNameList.add(CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTOFFICEBOX);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTALADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTALCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFERREDDELIVERYMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_REGISTEREDADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SEARCHGUIDE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SEEALSO);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATEORPROVINCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STREET);
		CIM_PropertyNameList.add(CIM_PROPERTY_TELEPHONENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_TELETEXTERMINALIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_TELEXNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_THUMBNAILLOGO);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNIQUEIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERPASSWORD);
		CIM_PropertyNameList.add(CIM_PROPERTY_X121ADDRESS);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUSINESSCATEGORY)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTIONS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONINDICATOR)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FACSIMILETELEPHONENUMBER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNATIONALISDNNUMBER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LABELEDURI)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALITYNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAIL)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MANAGER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OBJECTCLASS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ORGANIZATIONNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERMAILBOX)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTOFFICEBOX)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTALADDRESS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTALCODE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFERREDDELIVERYMETHOD)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REGISTEREDADDRESS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SEARCHGUIDE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SEEALSO)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATEORPROVINCE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STREET)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TELEPHONENUMBER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TELETEXTERMINALIDENTIFIER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TELEXNUMBER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_THUMBNAILLOGO)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNIQUEIDENTIFIER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERPASSWORD)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_X121ADDRESS)){
				continue;
			}
			
			CIM_OtherOrganizationInformation.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUSINESSCATEGORY, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONINDICATOR, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FACSIMILETELEPHONENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNATIONALISDNNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LABELEDURI, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALITYNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAIL, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MANAGER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OBJECTCLASS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORGANIZATIONNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERMAILBOX, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTOFFICEBOX, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTALADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTALCODE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFERREDDELIVERYMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REGISTEREDADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SEARCHGUIDE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SEEALSO, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATEORPROVINCE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STREET, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TELEPHONENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TELETEXTERMINALIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TELEXNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_THUMBNAILLOGO, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNIQUEIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERPASSWORD, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_X121ADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUSINESSCATEGORY)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTIONS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONINDICATOR)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FACSIMILETELEPHONENUMBER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNATIONALISDNNUMBER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LABELEDURI)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALITYNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAIL)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MANAGER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OBJECTCLASS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ORGANIZATIONNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERMAILBOX)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTOFFICEBOX)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTALADDRESS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTALCODE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFERREDDELIVERYMETHOD)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REGISTEREDADDRESS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SEARCHGUIDE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SEEALSO)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATEORPROVINCE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STREET)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TELEPHONENUMBER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TELETEXTERMINALIDENTIFIER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TELEXNUMBER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_THUMBNAILLOGO)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNIQUEIDENTIFIER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERPASSWORD)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_X121ADDRESS)){
				continue;
			}
			
			CIM_OtherOrganizationInformation.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OtherOrganizationInformation() {

		this.cimInstance	= new CIMInstance();
		
		for (int i = 0; i < CIM_PropertyList.size(); i++) {
			this.cimInstance.addProperty((CIMProperty)((CIMProperty)CIM_PropertyList.get(i)).clone());
		}
		
		this.cimObjectPath 	= new CIMObjectPath(CIM_CLASS_NAME);
		this.cimInstance.setObjectPath(this.cimObjectPath);

		this.original_cimInstance	= (CIMInstance)this.cimInstance.clone();

		setValidCimInstance(false);
	}


	/**
	*	Class constructor
	*/	
	public CIM_OtherOrganizationInformation(Vector keyProperties){ 
		this();
		
		if (keyProperties == null) {
			throw new InvalidParameterException("The keyProperties parameter does not contain a valid reference.");
		
		}
		
		Iterator iter = keyProperties.iterator();
		while (iter.hasNext()) {
			Object property = iter.next();
			
			if (property instanceof CIMProperty) {
				CIMProperty keyProperty = (CIMProperty)property;
				this.cimObjectPath.addKey(keyProperty);
				
				if (this.cimInstance.getProperty(keyProperty.getName()) != null) {
					this.cimInstance.removeProperty(keyProperty.getName());
				}
				this.cimInstance.addProperty(keyProperty);
				
			} else {
				throw new InvalidParameterException("The keyProperties parameter should only contain objects of class CIMProperty.");
				
			}
		}
		
		setValidCimInstance(false);
	}

	
	/**
	*	Class constructor
	*/	
	public CIM_OtherOrganizationInformation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!CIM_CLASS_NAME.equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class of the cimInstance must be of type " + CIM_CLASS_NAME + ".");
		}
		
		setCimInstance(cimInstance);
		this.original_cimInstance = (CIMInstance)cimInstance.clone();
		this.cimObjectPath        = cimObjectPath;
		setValidCimInstance(true);
	}

	
	/**
	*	The method returns the display name of the class
	*/	
	public String getClassDisplayName(){
		return CIM_CLASS_DISPLAYNAME;
	}
	
	//**********************************************************************
	// Instance methods
	//**********************************************************************

	/**
	*	no description
	*/	
	public boolean isDataValid(Vector invalidProperties) {
		boolean result = true;
		
		if (invalidProperties == null) {
			invalidProperties = new Vector();
		} else {
			invalidProperties.removeAllElements();
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		return result;
	}
	
	/**
	 * @return Returns the validCimInstance.
	 */
	public boolean isValidCimInstance() {
		return this.validCimInstance;
	}
	
	/**
	 * @param validCimInstance The validCimInstance to set.
	 */
	private void setValidCimInstance(boolean isValidCimInstance) {

		this.validCimInstance = isValidCimInstance;
	}
	
	
	/**
	*	The method returns this CIM instance
	*/
	public CIMInstance getCimInstance() {
		
		return this.cimInstance;
	}
	
	
	/**
	*	The method sets this CIM instance
	*/
	public void setCimInstance(CIMInstance cimInstance) {
		
		this.cimInstance = cimInstance;
	}
	
		
	/**
	*	The method returns this CIM object path
	*/
	public CIMObjectPath getCimObjectPath() {
		return this.cimObjectPath;
	}
	
	
	/**
	*	The method checks if the cimInstance has been modified
	*/
	public boolean isModified() {
	    
	    if (!this.original_cimInstance.equals(this.cimInstance)) 
	        return true;
	    
	    return false;
	}
	
	
	/**
	*	The method resets the values of the cimInstance
	*/	
	public void resetValues() {
	    this.cimInstance = (CIMInstance)this.original_cimInstance.clone();
	}
	
	
	/**
	*	The method checks if the cimInstance equals an other cimInstance
	*/	
	public boolean equals(Object object) {
	    
	    if (!(object instanceof CIM_OtherOrganizationInformation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OtherOrganizationInformation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OtherOrganizationInformation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OtherOrganizationInformation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OtherOrganizationInformation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OtherOrganizationInformation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OtherOrganizationInformation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OtherOrganizationInformation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OtherOrganizationInformation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OtherOrganizationInformation)object).cimObjectPath)) {
	        return false;
	        
	    } 
	    
	    return true;
	}
	
	/**
	*	The method return this method as a string
	*/	
	public String toString() {
		return this.cimInstance.toString();
	}

	//*****************************************************
	// Associators methods
	//*****************************************************
	
	public ArrayList getAssociated_CIM_Organization_CIM_MoreOrganizationInfos(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREORGANIZATIONINFO, 
					CIM_Organization.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OtherOrganizationInformation.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OtherOrganizationInformation.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_OtherOrganizationInformation.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_OtherOrganizationInformation.Java_Package_List.setElementAt((String)(CIM_OtherOrganizationInformation.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_OtherOrganizationInformation.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Organization(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Organization(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Organization(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_Organization_CIM_MoreOrganizationInfo_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREORGANIZATIONINFO, 
					CIM_Organization.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Organization.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute BusinessCategory
	
	public String[] get_BusinessCategory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_BusinessCategory(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_BusinessCategory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_BUSINESSCATEGORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Descriptions
	
	public String[] get_Descriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Descriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_Descriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DestinationIndicator
	
	public String[] get_DestinationIndicator() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_DestinationIndicator(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_DestinationIndicator(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_DESTINATIONINDICATOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FacsimileTelephoneNumber
	
	public String[] get_FacsimileTelephoneNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_FacsimileTelephoneNumber(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_FacsimileTelephoneNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternationaliSDNNumber
	
	public String[] get_InternationaliSDNNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_InternationaliSDNNumber(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_InternationaliSDNNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_INTERNATIONALISDNNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LabeledURI
	
	public String[] get_LabeledURI() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_LabeledURI(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_LabeledURI(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LABELEDURI + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalityName
	
	public String[] get_LocalityName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_LocalityName(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_LocalityName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_LOCALITYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Mail
	
	public String[] get_Mail() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Mail(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_Mail(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MAIL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Manager
	
	public String[] get_Manager() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Manager(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_Manager(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_MANAGER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ObjectClass
	
	public String[] get_ObjectClass() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ObjectClass(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_ObjectClass(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OBJECTCLASS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OrganizationName
	
	public String[] get_OrganizationName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_OrganizationName(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_OrganizationName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_ORGANIZATIONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherMailbox
	
	public String[] get_OtherMailbox() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_OtherMailbox(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_OtherMailbox(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_OTHERMAILBOX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PhysicalDeliveryOfficeName
	
	public String[] get_PhysicalDeliveryOfficeName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_PhysicalDeliveryOfficeName(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_PhysicalDeliveryOfficeName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PHYSICALDELIVERYOFFICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostOfficeBox
	
	public String[] get_PostOfficeBox() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_PostOfficeBox(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_PostOfficeBox(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTOFFICEBOX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostalAddress
	
	public String[] get_PostalAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_PostalAddress(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_PostalAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostalCode
	
	public String[] get_PostalCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_PostalCode(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_PostalCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_POSTALCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PreferredDeliveryMethod
	
	public String get_PreferredDeliveryMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PreferredDeliveryMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_PreferredDeliveryMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_PREFERREDDELIVERYMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RegisteredAddress
	
	public String[] get_RegisteredAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_RegisteredAddress(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_RegisteredAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_REGISTEREDADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SearchGuide
	
	public String[] get_SearchGuide() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SearchGuide(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_SearchGuide(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEARCHGUIDE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SeeAlso
	
	public String[] get_SeeAlso() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SeeAlso(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_SeeAlso(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_SEEALSO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StateOrProvince
	
	public String[] get_StateOrProvince() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_StateOrProvince(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_StateOrProvince(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STATEORPROVINCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Street
	
	public String[] get_Street() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Street(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_Street(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_STREET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TelephoneNumber
	
	public String[] get_TelephoneNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_TelephoneNumber(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_TelephoneNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TeletexTerminalIdentifier
	
	public String[] get_TeletexTerminalIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_TeletexTerminalIdentifier(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_TeletexTerminalIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELETEXTERMINALIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TelexNumber
	
	public String[] get_TelexNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_TelexNumber(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_TelexNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_TELEXNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ThumbnailLogo
	
	public String[] get_ThumbnailLogo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ThumbnailLogo(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_ThumbnailLogo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_THUMBNAILLOGO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UniqueIdentifier
	
	public String[] get_UniqueIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_UniqueIdentifier(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_UniqueIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_UNIQUEIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserPassword
	
	public String[] get_UserPassword() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_UserPassword(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_UserPassword(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_USERPASSWORD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute X121Address
	
	public String[] get_X121Address() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_X121Address(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS + " could not be found");
    		
		} else if (!CIM_OtherOrganizationInformationHelper.isValid_X121Address(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OtherOrganizationInformation.CIM_PROPERTY_X121ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
