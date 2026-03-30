package dsa.algo.qa;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInputFromConsole {
	public static void main(String[] args) {
		
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		String arr[]=new String[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.next();
		}
		System.out.println(Arrays.toString(arr));
	}

}
