package dsa.algo.qa;

import java.util.Arrays;

public class Array2d {
	
	//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
	 public static int findNumbers(int[] nums) {
	        int count=0;
	        
	        for(int a:nums) {
	        	
	        	if(even(a)) {
	        		count++;
	        	}
	        }
	        
	        return count;
	    }
	 //function to check the contains even digit
	 
	 
	private static boolean even(int a) {
		// TODO Auto-generated method stub
		
		
		return false;
	}
	 public static int maximumWealth(int[][] accounts) {
	        int sum=0;
	        int max=Integer.MIN_VALUE;
	        for(int person[]:accounts){
	            for(int account:person){
	                sum=sum+account;
	            }
	            if(sum>max){
	                max=sum;
	            }
	        }
	        
	         return max;
	    }
	 
	 
//Binary Search
	 
	 public static int binarySearch(int arr[],int target) {
		
		 int start=0;
		 int end=arr.length-1;
		 
		 while(start<end) {
			 int mid=start+end-start/2;
			 
			 if(target >arr[mid] ){
				 end=mid-1;
				 return end;
			 }
			 else if(target <arr[mid]) {
				 start=mid+1;
				 return start;
			 }
			 else {
				 return mid;
			 }
			 
		 }
		 
		 
		 return -1;
	 }
	public static void main(String[] args) {
		
		int array[]= {1,3,5,6,7,8,10};int target=8;
		System.out.println(binarySearch(array,target));
		
//		int arrs[][]= {
//				{1,2,3},
//				{3,2,1}
//				};
//
//        System.out.println(maximumWealth(arrs));
		
		
//		
//		int [][] arr= {
//				{14,2,4,5},
//				{5,2,3,5},
//				{9,-6,-2,11},
//				{5,1,5}
//		};
//		int target=3;
//		int arrs[]=search(arr,target);
//		System.out.println(Arrays.toString(arrs));
//		System.out.println("Longest Max value Matrix");
//		System.out.println(searchMax(arr));
//		System.out.println("shortest Min value Matrix");
//		System.out.println(searchMin(arr));
//		//secMin//
//		System.out.println("Second Min value of Matrix");
//		System.out.println(searchSecondMin(arr));
//		
//		//secMax
//		System.out.println("Second Max value of Matrix");
//		System.out.println(searchSecondMax(arr));
//		
		//Max value index
//		System.out.println("Index of Max value Matrix");
//	
//		System.out.println(Arrays.toString(searchMaxValueIndex(arr)));
		
		//Min value Index 
//		System.out.println("Index of Min value Matrix");
	//	System.out.println(Arrays.toString(searchMinValueIndex(arr)));
		
		//second Min Indeces
//		System.out.println("Index of Second Min Of  Matrix");
//		System.out.println(Arrays.toString(SearchSecondMinValueindeces(arr)));
//		
//		//second Max Indeces
//		System.out.println("Index of Second Maxium Of  Matrix");
//		System.out.println(Arrays.toString(SearchSecondMAXValueindeces(arr)));
	}
	public static int[] SearchSecondMAXValueindeces(int arr[][]) {
		int max=Integer.MIN_VALUE;
		int secMax=max;
		int index[]=new int[2];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>max) {
					secMax=max;
					max=arr[row][col];
				}
				else if(arr[row][col]!=max && arr[row][col]<secMax ) {
					secMax=arr[row][col];
					index[0]=row;
					index[1]=col;
				}
			}
		}
		System.out.println(secMax);
		return index;
	}
	public static int[] SearchSecondMinValueindeces(int arr[][]) {
		int min=Integer.MAX_VALUE;
		int secMin=min;
		int index[]=new int[2];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]<min) {
					secMin=min;
					min=arr[row][col];
				}
				else if(arr[row][col]!=min && arr[row][col]<secMin ) {
					secMin=arr[row][col];
					index[0]=row;
					index[1]=col;
				}
			}
		}
		System.out.println(secMin);
		return index;
	}
	
	public static int searchSecondMin(int arr[][]) {
		int min	=Integer.MAX_VALUE;
		int secMin=min;
		
		for(int ar[]:arr) {
			for(int a:ar) {
				if(a <min) {
					secMin=min;
					min=a;
				}
				else if(a!=min && a<secMin) {
					secMin=a;
				}
			}
		}
		
		return secMin;
	}
	public static int searchSecondMax(int arr[][]) {
		int max=Integer.MIN_VALUE;
		int secMax=max;
		for(int ar[]:arr) {
			for(int a:ar) {
				if(a>max) {
					secMax=max;
					max=a;
				}
				else if(a!=max && a>secMax) {
					secMax=a;
				}
			}
		}
		
		return secMax;
	}
	public static int searchMin(int[][] arr){
	int min=Integer.MAX_VALUE;
	for(int ar[]:arr) {
		for(int a:ar) {
			if(a<min) {
				min=a;
			}
		}
	}
return min;
	}
//Min value Index 
	public static int[] searchMinValueIndex(int arr[][]) {
	
	int min=Integer.MAX_VALUE;
	int index[]=new int[2];
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			if(arr[row][col] <min) {
				min=arr[row][col];
				index[0]=row;
				index[1]=col;
			}
		}
	}
	System.out.println(min);
	return index;
	}
	private static int[] searchMaxValueIndex(int[][] arr) {
	// TODO Auto-generated method stub
	int max=Integer.MIN_VALUE;
	
	int index[]=new int[2];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			
			if(arr[i][j] >max) {
				max=arr[i][j];
				
				 index[0]=i;
				 index[1]=j;
			}
		}
	}
	System.out.println(max);
	return index;
	}
	private static int searchMax(int[][] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j] >max) {
					 max=arr[i][j];
					
				}
			}
		}
		return max;
	}
	private static int[] search(int[][] arr, int target) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]==target) {
					System.out.println(arr[i][j]);
					return new int[] {i,j};
					
				}
			}
		}
		return new int[] {-1,-1};
	}

}
