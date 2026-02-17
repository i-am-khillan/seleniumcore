package companyCode;

import java.util.HashSet;
import java.util.Set;

public class LastRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcaad";
		char s = lastRepeatingCharacter(str);
		System.out.println(s);
	}

	public static Character lastRepeatingCharacter(String s) {

		if (s == null && s.isEmpty())
			return null;
		Set<Character> set = new HashSet<Character>();
		for (int i = s.length() - 1; i >= 0; i--) {

			char ch = s.charAt(i);
			if (set.contains(ch)) {
				return ch;
			}
			set.add(ch);
		}
		return null;
	}

}
