package leecode;

public class palindrome {
	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;//ignore non alpha numaric 
			while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;//ignore non alpha numaric
			if (Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++; j--;//move pointer towards each other
		}
		return true;
	}
}