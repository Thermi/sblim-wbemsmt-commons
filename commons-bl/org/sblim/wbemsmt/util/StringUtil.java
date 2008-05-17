 /** 
  * StringUtil.java
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
  * Description: Util-Class for String(Array)-Functions
  * 
  */
package org.sblim.wbemsmt.util;

import java.util.ArrayList;
import java.util.List;

import javax.cim.UnsignedInteger16;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;


public class StringUtil
{
	
	/**
	 * Searches for the element given by value in the array given by values and returns the index
	 * @param values
	 * @param value
	 * @return -1 if the value was not found
	 */
	public static int indexOf(String[] values, String value)
	{
		if (values == null)
			return -1;
		
		for (int i = 0; i < values.length; i++) {
			String value1 = values[i];
			if (value1 != null && value1.equals(value))
			{
				return i;
			}
			else if (value1 == null && value == null)
			{
				return i;
			}
		}
		
		return -1;
	}

	/**
	 * Searches for the element given by value in the array given by values and returns the index
	 * @param values
	 * @param value
	 * @param defaultValue
	 * @return the index or the default value if the value was not found
	 */
	public static UnsignedInteger16 indexOfAsUnsignedInt16(String[] values, String value, UnsignedInteger16 defaultValue) {
		int indexOf = indexOf(values, value);
		if (indexOf > -1)
		{
			return new UnsignedInteger16(indexOf);
		}
		else
		{
			return defaultValue;
		}
	}

	
	public static List asList(String[] values)
	{
		List result = new ArrayList();
		for (int i = 0; i < values.length; i++) {
			String value = values[i];
			result.add(value);
		}
		
		return result;
	}

	public static boolean containsWhitespaces(String value) {

		if (value != null)
		{
			for (int i=0; i < value.length(); i++)
			{
				if (StringUtils.isWhitespace(value.substring(i,i+1)))
				{
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Get the value within the array at the given position 
	 * @param array
	 * @param position
	 * @return value within the array at the given position or null if the position is null or is no valid index within the array
	 */

	public static String getValueByIndex(String[] array, Number position) {
		if (position != null)
		{
			return getValueByIndex(array, position.intValue());
		}
		return null;
	}

	/**
	 * Get the value within the array at the given position 
	 * @param array
	 * @param position
	 * @return value within the array at the given position or null if the position is no valid index within the array
	 */
	
	public static String getValueByIndex(String[] array, int position) {
		if (position < array.length)
		{
			return array[position];
		}
		return null;
	}

	/**
	 * Creates a string with all the values within the given arrays in the format &lt;values[0]&gt;&lt;separator&gt;&lt;values[1]&gt;&lt;separator&gt;&lt;values[2]&gt;...
	 * @param values
	 * @param separator
	 * @return
	 */
	public static String asString(String[] values, String separator) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; values != null && i < values.length; i++) {
			if (sb.length() > 0)
			{
				sb.append(separator);
			}
			sb.append(values[i]);
		}
		return sb.toString();
	}

	/**
	 * Insert a platform dependent linebreak making sure that the text per line is not longer than the value defined by max
	 * 
	 * The maximum length of a line is: max + maxWordLengthBeforeCutoff + cutOffCharacters.length()
	 * 
	 * @param text the text to insert lineBreak
	 * @param max the maximum length per line
	 * @param maxWordLengthBeforCutoff the maximum length of a word befor the word is cuttoff - can be null. In that the case the next whitespace is used. If there is no whitespace the string is not truncated and is read to the end
	 * @param cutOffCharacters the character that are append if a word is cut off
	 * @return
	 */
    public static String insertLineBreak(String text, int max, int maxWordLengthBeforeCutoff, String cutOffCharacters) {
        return insertLineBreak(text, null, max, maxWordLengthBeforeCutoff, cutOffCharacters);
    }

    /**
     * Insert a linebreak making sure that the text per line is not longer than the value defined by max
     * 
     * The maximum length of a line is: max + maxWordLengthBeforeCutoff + cutOffCharacters.length()
     * 
     * @param text the text to insert lineBreak
     * @param linebreak string for a linebreak. Example: \n or &lt;br&gt; . If not sure which one to use: use the method without linebreak. If null RuntimeUtil.getLineBreak() is used to fiond the presentation layer dependent one
     * @param max the maximum length per line
     * @param maxWordLengthBeforCutoff the maximum length of a word befor the word is cuttoff - can be null. In that the case the next whitespace is used. If there is no whitespace the string is not truncated and is read to the end
     * @param cutOffCharacters the character that are append if a word is cut off
     * @return
     */
    public static String insertLineBreak(String text, String linebreak, int max, int maxWordLengthBeforeCutoff, String cutOffCharacters) {
        if (linebreak == null)
        {
            linebreak = RuntimeUtil.getLineBreak();
        }
        List lines = splitLines(text,max,maxWordLengthBeforeCutoff,cutOffCharacters);
        String result = StringUtils.join(lines.iterator(), linebreak);
        return result;
    }

    /**
     * Split the text in many lines 
     * @param text the text to insert lineBreak
     * @param max the maximum length per line
     * @param maxWordLengthBeforCutoff the maximum length of a word befor the word is cuttoff - only used if cutOffCharacters is not null 
     * @param cutOffCharacters the character that are append if a word is cut off - can be null. In that the case the next whitespace is used. If there is no whitespace the string is not truncated and is read to the end
     * @return
     */
    public static List splitLines(String text, int max,int maxWordLengthBeforeCutoff, String cutOffCharacters) {
        
        List lines = new ArrayList();
        
        while (text != null && text.length() > max)
        {
            String part = text.substring(0,max);
            int idx = part.lastIndexOf(" ");
            String text1 = null;
            //try to go back until the last space and cut off there
            if (idx > -1)
            {
                lines.add(text.substring(0,idx));
                text1 = text.substring(idx+1);
            }
            else
            {
                idx = text.indexOf(" ");
                //do we need to cut off ?
                if (cutOffCharacters != null && (idx == -1 || idx > max + maxWordLengthBeforeCutoff))
                {
                    lines.add(text.substring(0,max + maxWordLengthBeforeCutoff) + cutOffCharacters);
                    text1 = text.substring(max + maxWordLengthBeforeCutoff);
                }
                else
                {
                    lines.add(text.substring(0,idx > -1 ? idx : text.length()));
                    text1 = text.substring(idx+1);
                }
            }
            if (text1.equals(text))
            {
                text = "";
            }
            else
            {
                text = text1;
            }
        }
        
        //add the last one
        if (StringUtils.isNotEmpty(text))
        {
            lines.add(text);
        }
        
        return lines;
    }

}
