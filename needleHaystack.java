/*Implement strstr(). Returns the index of the first occurrence of needle in haystack, or ¨C1
*if needle is not part of haystack.
*
*The function returns the first occurance of needle
*return -1 if needle is not in haystack
*/


public class needleHaystack {
    public int strStr(String haystack, String needle) {
    	for (int i = 0; ; i++) {
    		for (int j = 0; ; j++) {
    			if (j == needle.length()) return i;
    			if (i + j == haystack.length()) return -1;
    			if (needle.charAt(j) != haystack.charAt(i + j)) break;
    		}
    	}        
    }
}

