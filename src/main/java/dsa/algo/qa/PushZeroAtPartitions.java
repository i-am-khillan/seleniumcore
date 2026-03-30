package dsa.algo.qa;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PushZeroAtPartitions {

	public static void main(String[] args) {
//        System.out.println("input arr element");
//        int arr[]={0,1,0,2,3,0,4,0,0,0};
//        int high=arr.length-1;
//        System.out.println(Arrays.toString(arr));
//        partition(arr,0,high);
//        System.out.println("push zero at the end");
//         System.out.println(Arrays.toString(arr));

		/*
		 * int arrs[]= {3,4,-2,6,-1,-3,4,-5}; //
		 * System.out.println(Arrays.toString(arrs)); int high=arrs.length-1; //
		 * System.out.println(Arrays.toString(alternativePosNeg(arrs,0,high)));
		 */

		
		  int arrs[]= {3,4,2,6,1,3,4,5}; System.out.println(Arrays.toString(arrs)); int
		  high=arrs.length-1; 
		  int array[]=alernativeSwapOddEven(arrs,0,high);
		  System.out.println(Arrays.toString(array));

		 
		System.out.println( primenumber(17));
	}

	public static boolean primenumber(int num) {
		int c=2;
		if(num <=1)
		while(c*c<num) {
			if(num%c==0) {
				//System.out.println("not prime number");
				return false;
				
			}
			c=c+1;
		}
		return true;
		//System.out.println("Prime Number");
	}
public static void lenearSearch(int arr[]) {
	
}
	public static int[] alternativePosNeg(int arr[], int low, int high) {
		int pIndex = partitions(arr, low, high);
		int n = arr.length / 2;
		int neg_idx = 0;
		int pos_idx = n;
		while (pos_idx < 2 * n && neg_idx < n) {
			swap(arr, pos_idx, neg_idx);
			neg_idx += 2;
			pos_idx += 2;
		}
		return arr;
	}

	public static int partitions(int arr[], int low, int high) {
		// [3,-2,4,-1,6,-1,-3,4,-5
		int i = low - 1;
		int pivot = 0; // zero
		for (int j = low; j < high; j += 1) {
			if (arr[j] > pivot) // Greater than to pivot
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	public static int[] alernativeSwapOddEven(int arr[],int low,int high) {
	
		int n=arr.length/2;
		int odd_idx=0;
		int even_idx=n;
		while(odd_idx<2*n && even_idx>n) {
			swap(arr,odd_idx,even_idx);
			
			odd_idx+=2;
			even_idx+=2;
		}
		return arr;
	}
	public static void alternativeSwapPositiveNegative(int arr[], int low, int high) {
		// [3,-2,4,-1,6,-1,-3,4,-5
		int i = low - 1;
		int pivot = 0; // zero
		for (int j = low; j < high; j += 1) {
			if (arr[j] > pivot) // Greater than to pivot
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		
		
	}

	public static void alternativeSwapEvenOdd(int arr[], int low, int high) {
		// [3,-2,4,-1,6,-1,-3,4,-5
		int i = low - 1;
		// int pivot=0; //zero
		for (int j = low; j < high; j += 1) {
			if (arr[j] % 2 == 0) // Greater than to pivot
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
	}

	// Push zero at the end
	public static void partition(int arr[], int low, int high) {
		int i = low - 1;
		// int pivot=arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] != 0) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
	}

	public static void swap(int arr[], int i, int j) {

		if (i == j)
			return;
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
	}
}
