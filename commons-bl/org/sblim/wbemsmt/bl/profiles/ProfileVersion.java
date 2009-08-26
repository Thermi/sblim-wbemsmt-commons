 /** 
  * ProfileVersion.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Class to represent and compare the version of a profile
  * 
  */
package org.sblim.wbemsmt.bl.profiles;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.util.StringTokenizer;

public class ProfileVersion {

	private int major;
	private int minor;
	private int patch;

	/**
	 * Create a new Profile version object
	 * @param major the major version
	 * @param minor the minor version
	 * @param patch the patch level
	 */
	public ProfileVersion(int major, int minor, int patch) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}

	/**
     * Creates a objects the given information in the String expects a string of the format &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt; -
     * if one if the element contains an alpha character (e.g. 1.0.0a) the character is removed
     * 
     * @param stringWithMajorMinorPatch the string with the specified format
     * @throws WbemsmtException
     *             thrown if the Strings is not matching the required format
     */
	public ProfileVersion(String stringWithMajorMinorPatch) throws WbemsmtException {
		int count = StringUtils.countMatches(stringWithMajorMinorPatch, ".");
		if (count == 0)
		{
		    stringWithMajorMinorPatch = stringWithMajorMinorPatch + ".0.0";
		}
        if (count == 1)
        {
            stringWithMajorMinorPatch = stringWithMajorMinorPatch + ".0";
        }
        count = StringUtils.countMatches(stringWithMajorMinorPatch, ".");
		if (count == 2)
		{
 			try {
 			    stringWithMajorMinorPatch = stringWithMajorMinorPatch.replaceAll("[a-zA-Z]", "");
				String[] strings = new StringTokenizer(stringWithMajorMinorPatch,".").asArray(true, false);
				this.major = Integer.parseInt(strings[0]);
				this.minor = Integer.parseInt(strings[1]);
				this.patch = Integer.parseInt(strings[2]);
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Expected a string with the format <major>.<minor>.<patch> - Received: " + stringWithMajorMinorPatch);
	}

    /**
     * get the major version number
     * @return the major version number
     */
	
	public int getMajor() {
		return major;
	}

    /**
     * set the major version number
     * @param major the major version number
     */
	public void setMajor(int major) {
		this.major = major;
	}

	/**
	 * get the minor version number
	 * @return the minor version number
	 */
	public int getMinor() {
		return minor;
	}

    /**
     * set the minor version number
     * @param minor the minor version number
     */
	public void setMinor(int minor) {
		this.minor = minor;
	}

	/**
	 * get the patch level
	 * @return the patch level
	 */
	public int getPatch() {
		return patch;
	}

	/**
	 * set the patch level of this version
	 * @param patch the patch level
	 */
	public void setPatch(int patch) {
		this.patch = patch;
	}

	/**
	 * returns true if the version is exactly the same
	 * @param version the version object
	 * @return true if the objects are equal
	 */
	public boolean equals(ProfileVersion version)
	{
		return major == version.major && 
		       minor == version.minor && 
		       patch == version.patch;
	}

	/**
	 * returns the hashcode of the object
	 * @return the hashcode
	 */
	public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + major;
        result = prime * result + minor;
        result = prime * result + patch;
        return result;
    }

	/**
	 * check if the objects are equal
	 * @param obj the object to compare 
	 * @return true if the objects are equal
	 */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ProfileVersion other = (ProfileVersion) obj;
        if (major != other.major)
            return false;
        if (minor != other.minor)
            return false;
        if (patch != other.patch)
            return false;
        return true;
    }

    /**
	 * returns true if the current version is newer than the given
	 * @param version to compare
	 * @return true if the current profile version is newer
	 */
	public boolean isNewer(ProfileVersion version)
	{
		return major > version.major ||
		       major == version.major && ( minor > version.minor || patch > version.patch ) ||
		       major == version.major && minor == version.minor && patch > version.patch;
	}

	/**
	 * returns true if the current version is older than the given version
	 * @param version the version to compar
	 * @return true if the current verison is older
	 */
	public boolean isOlder(ProfileVersion version)
	{
		return major < version.major ||
		       major == version.major && ( minor < version.minor || patch < version.patch ) ||
		       major == version.major && minor == version.minor && patch < version.patch;
	}
	
	/**
	 * return a String with the format &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
	 * @return &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
	 */
	public String toString()
	{
		return major + "." + minor + "." + patch;
	}
	
}
