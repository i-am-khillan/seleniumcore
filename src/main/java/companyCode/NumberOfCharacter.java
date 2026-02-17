package companyCode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharacter {
	
	public static void main(String[] args) {
		
		String sh="khillan verma";
		
		Map<Character,Integer> map=new HashMap<>();
		for(char ch: sh.toCharArray()) {
			
			map.put(ch, (map.getOrDefault(ch, 0)+1));
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			if(entry.getValue()!=1) {
				System.out.println(entry.getKey()+"------"+entry.getValue());
			}
		}
		
	}

}
