 /** 
  * ProfileVersion.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
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
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.util.StringTokenizer;

public class ProfileVersion {

	private int major;
	private int minor;
	private int patch;

	public ProfileVersion(int major, int minor, int patch) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}

	/**
	 * Creates a objects the given information in the String
	 * expects a string of the format <major>.<minor>.<patch>
	 * @param stringWithMajorMinorPatch
	 * @throws ModelLoadException thrown if the Strings is not matching the required format
	 */
	public ProfileVersion(String stringWithMajorMinorPatch) throws ModelLoadException {
		int count = StringUtils.countMatches(stringWithMajorMinorPatch, ".");
		if (count == 2)
		{
 			try {
				String[] strings = new StringTokenizer(stringWithMajorMinorPatch,".").asArray(true, false);
				this.major = Integer.parseInt(strings[0]);
				this.minor = Integer.parseInt(strings[1]);
				this.patch = Integer.parseInt(strings[2]);
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		throw new ModelLoadException("Expected a string with the format <major>.<minor>.<patch> - Received: " + stringWithMajorMinorPatch);
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public int getMinor() {
		return minor;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public int getPatch() {
		return patch;
	}

	public void setPath(int patch) {
		this.patch = patch;
	}

	/**
	 * returns true if the version is exactly the same
	 * @param version
	 * @return
	 */
	public boolean equals(ProfileVersion version)
	{
		return major == version.major && 
		       minor == version.minor && 
		       patch == version.patch;
	}
	
	/**
	 * returns true if the current version is newer than the given
	 * @param version
	 * @return
	 */
	public boolean isNewer(ProfileVersion version)
	{
		return major > version.major ||
		       major == version.major && ( minor > version.minor || patch > version.patch ) ||
		       major == version.major && minor == version.minor && patch > version.patch;
	}

	/**
	 * returns true if the current version is older than the given version
	 * @param version
	 * @return
	 */
	public boolean isOlder(ProfileVersion version)
	{
		return major < version.major ||
		       major == version.major && ( minor < version.minor || patch < version.patch ) ||
		       major == version.major && minor == version.minor && patch < version.patch;
	}
	
	public String toString()
	{
		return major + "." + minor + "." + patch;
	}
	
}
