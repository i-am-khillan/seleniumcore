package March62026_Prep_infosys;

public class ProgramSolves {
	
	public static void main(String[] args) {
		
		//infosys Interview :-L3
		//Quest:1
		String s="null";
		String str1="abc";
		
		String st=null;
	//	System.out.println(st.equals(null)); //null keyword is assigned to String as value null and perform the operation on it.
		System.out.println(s.equals("null")); // null is value assigned to String and perform the operation on value not keywoard that/why true.
		System.out.println(s.equals("null") ||str1.equals("abc"));

	
	//Quest :2
	/**
	 * Method overloading vs method overriding
	 * 1. Method overloading : it is compile time polymorphism . 
	 * it will happen when method/function have 
	 * different parameter or m(int a ,int b) or m(int b)
	 * 					
	 * different type of Parameter m(int a,String c,int b)
	 * different sequence of parameter m(int a,int b,string c)
	 * this is only method signature is consider like MethodName(method Arguments)//
	 * 
	 * 1.Method Overriding : it is runtime polymorphism;
	 * it will happen when 2 class have parent & child relationship
	 * parent class method name,parameter,returnType,and modifier must be same
	 * 
	 * class Parent{
	 * 	public void test(String name){
	 * 		System.out.println("Parent class methods");
	 * }
	 * class Child extends Parent{
	 * 
	 * public void test(String s){
	 * System.out.println("Child class methods");
	 * }
	 * 
	 * }
	 * }
	 * 	
	 */
		
	}

}
