package companyCode;

public class EvenNumber100 {
	
	public static void main(String[] args) {
		
		
		printASCIIValueAZ();
	}
	public static void printASCIIValue() {
		//a-z ascii value
		for(int i='a';i<'z';i++) {
			System.out.println(i);
		}
	}
	public static void printASCIIValueAZ() {
		//a-z ascii value
		for(int i='A';i<'Z';i++) {
			System.out.println(i);
		}
	}
	public static void print1To100EVenNumber() {
		//print even number 1 to 100;
		
				for(int i=1;i<=100;i++) {
					if(i%2==0) {
						System.out.print(i+" ");
					}
				}
	}
}
