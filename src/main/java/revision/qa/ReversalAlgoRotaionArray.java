package revision.qa;

public class ReversalAlgoRotaionArray {
	
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		
		printArray(arr);
		int k=2;
		rightRotation(arr,k);
		System.out.println("---------------------");
		printArray(arr);
		
		System.out.println("---------------------");
		int arra[]= {1,2,3,4,5};
		int kk=4;
		leftRotation(arra, kk);
		printArray(arra);
	}
	
	public static void printArray(int arr[]) {
		for(int i:arr) {
			System.out.print(i+",");
		}
	}
	public static void rightRotation(int arr[],int k) {
		
		if(arr==null && k>=1)return ;
		int n=arr.length;
		reverseArray(arr,0,n-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, n-1);
	}
	public static void leftRotation(int arr[],int k) {
		
		int n=arr.length;
		rightRotation(arr,n-k); // leftRotaion(arr, k) == rightRotation(arr,n-k);
	}
	
	public static void reverseArray(int arr[], int low,int high) {
		
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			
			low++;
			high--;
		}
	}

}
