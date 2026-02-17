package companyCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacter {
	
	public static void main(String[] args) {
		
		String s="khillan String name";
		
		Set<Character> seen=new HashSet<>();
		Set<Character> duplicate=new LinkedHashSet<Character>();
		for(char c:s.toCharArray()) {
		
			if(!seen.add(c)) {
				duplicate.add(c);
			}			
		}
		System.out.println(duplicate);
		
		List list=new ArrayList();
		String str[]={"banana","apple","mango"};
		Collections.addAll(list, str);
		System.out.println(list);
		
	}

}
