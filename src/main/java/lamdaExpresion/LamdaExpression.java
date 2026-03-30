package lamdaExpresion;

public class LamdaExpression {

	
	
	//Functional Programming :
	//annonymous class
	
	/*
	 * 	what is Lambda expression
	 * benefit of Lambda expression
	 * how to write the Lambda
	 * important rule for Lambda
	 * 
	 * 
	 * 
	 */
	
	//Lambda Expression 
	/**
	 * Lambda is anonymous function
	 * No Name 
	 * No Modifier
	 * No Return Type
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("My System started");
		
//		MyInterf myInter=new MyInterImplements();
//		myInter.sayHello();
		
		MyInterf i=new MyInterf() {//child class for implementing the interface
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("this is first anonymous class");
			}
		};
		i.sayHello();
		
		MyInterf i2=new MyInterf() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("this is second anonymous class");
					
			}
		};
		i2.sayHello();
		
		//Using our interface with the help of Lambda expression
	//case 1
	MyInterf Lambda=() ->{
		System.out.println("this is first time I am using the lamda expression");
	};
	Lambda.sayHello();	

	//applies rule for Lambda,
	
	MyInterf lambda2=()-> 	System.out.println("this is second time I am using the lamda expression");
	
		lambda2.sayHello();
		
		//Lambda expression:
		
//		SumInterface sums=(int a,int b)->{
//			return a+b;
//		};
//		
		SumInterface sums=(a,b)-> a+b;
		
		System.out.println(sums.sum(3, 6));
		System.out.println(sums.sum(12, 4));
		
		
		LengthInterf lengths=str->str.length();
		System.out.println(lengths.lengthInterf("khillan"));
		
		
	}

}
