package dsa.algo.qa;

import java.util.Arrays;

public class Quick_sort_Demo {
	
	
	public static void main(String[] args) {
		int arr[]= {3,4,1,2,9,8,1,5};
		System.out.println(Arrays.toString(arr));
		
		int high=arr.length-1;
		quick_sort(arr,0,high);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void quick_sort(int arr[],int low,int high){
		
		if(low<high) {
			int pindex=partition(arr,low,high);
			quick_sort(arr,low,pindex-1);
			quick_sort(arr,pindex+1,high);
		}
		
	}

	public static void swap(int arr[],int a,int b) {
		if(a==b)return;
		int i=arr[a];
		arr[a]=arr[b];
		arr[b]=i;
	}
	private static int partition(int[] arr, int low, int high) {
		
		int i=low-1;
		int pindex=arr[high];
		for(int j=low;j<high;j++) {
			if(arr[j]<=pindex) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);	
		return i+1;
	}
}
