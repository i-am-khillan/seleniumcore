package March62026_Prep_infosys;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ChildClass extends ParentClass{
	
	public void test(String n) {
		System.out.println("Child class method name test");
	}
	
	//input= java python java python .net python
public static void removeDuplicate(String words) {
		String str[]=words.split(" ");
		Set<String> set=new LinkedHashSet<>();
		boolean b[]=new boolean[256];
		
		String rev="";
		for(String word:str) {
			if(!set.contains(word)) {
				rev=rev+word+",";

			set.add(word);
			}
		}
		System.out.println(rev);
		System.out.println(set);
	}
public static String reveseCharacter(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i)+"";
	}
	return rev;
	
}
public static String reverseWords(String s) {
	String rev="";
	String word[]=s.split(" ");
	for(String words:word) {
		rev=rev+reveseCharacter(words)+" ";
	}
	
	return rev;
}
public static String reverseStringUsingTwoPointer(String c) {
	char s[]=c.toCharArray();
	int left=0;
	int right=s.length-1;
	while(left<right) {
		char tem=s[left];
		s[left]=s[right];
		s[right]=tem;
		
		left++;
		right--;
	}
	return new String(s);
}
	
public static void rotateArrayKPosition(int arr[],int k) {
	
	int n=arr.length-1;
	if(n==0)return ;
	k=n%k;
	if(k==0)return ;
	reverseString(arr,0,n-1);
	reverseString(arr,0 ,k-1);
	reverseString(arr,k,n-1);

}
private static void reverseString(int arr[],int left,int right) {
	while(left<right) {
		int tem=arr[left];
		arr[left]=arr[right];
		arr[right]=tem;
		left--;
		right++;
	}
	//return arr;
}
private static void printArray(int []arr) {
	for(int i:arr) {
		System.out.print(i+",");
	}
	System.out.println("  -----------");
}

public static int[] pushMoveZeroEnd(int arr[]) {
	int arrOrg[]=new int[arr.length];
	int i=0;
	for(int ii:arr) {
		if(ii>0) {
			arrOrg[i++]=ii;
		}
	}
	while(i<arr.length) {
		arr[i++]=0;
	}
	return arrOrg;
}

public static void rotateArray(int arr[],int k) {
	
	int n=arr.length-1;
	if(n ==0)return;
	k=n%k;
	if(k==0)return;
	reverses(arr,0,n-1);
	reverses(arr,0,k-1);
	reverses(arr,k,n-1);
	
}
public static void reverses(int arr[],int left,int right) {
	while(left<right) {
		int tem=arr[left];
		arr[left]=arr[right];
		arr[right]=tem;
		left++;
		right--;
	}
}
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(array));
		rotateArray(array,3);
		System.out.println(Arrays.toString(array));
		
		int arr[]= {0,1,2,3,0,0,2,0,4,0};
		System.out.println(Arrays.toString(arr));
		int arrs[]=	pushMoveZeroEnd(arr);
		System.out.println(Arrays.toString(arrs));
		
		
//		int arr[]= {1,2,3,4,5,6,7};
//		System.out.println((Arrays.toString(arr)));
//		printArray(arr);
//		rotateArrayKPosition(arr,3);
//		System.out.println((Arrays.toString(arr)));
//		
//		
//		String inputs = "selenium is automation tool";
//	System.out.println(	reverseWords(inputs));//
//	 
//	System.out.println(reverseStringUsingTwoPointer("khillan"));
//		
//		
//		String input= "java python java python .net python";
//		removeDuplicate(input);
//		int ar[]= {2,3,5,3};
//		String[]string= {"khillan","prem"};
//		main(ar);
//		//main(string,1);
		
//		ParentClass p=new ChildClass();
//		System.out.println("calling the methods");
//		p.test("Testing by khillan");
//		
//		ChildClass c=new ChildClass();
//		System.out.println("calling the methods");
//		c.test("Testing by dev");
//		
//		ParentClass pc=new ParentClass();
//		System.out.println("calling the methods");
//		pc.test("Testing by khillan");
		
	//	ChildClass cc=(ChildClass) new ParentClass();
	//	cc.test("khillan"); it iinvalid case 
		
		
		ParentClass pp=new ChildClass();
		//System.out.println("calling the methods");
		//pp.test("Testing by khillan");
	//	pp.main(ar);
	
	}
	public static void main(int [] arg){

		String s="abc";

		System.out.println("child int parameter");
	}
//	public static void main(String st[],int i) {
//		System.out.println("String and int param");
//	}
	
/**
 * Question : what is merchant or acquirer /issuer 
 * Merchant : who sells the goods and service to the customer
 * Issuer : who issued the card like hdfc, icici bank, 
 * Acquairer : merchant Banks : who provider the payment services 
 * 
 * 
 * 1️ Customer pays with card at merchant
	2 Acquirer (merchant’s bank) sends transaction to Visa/Mastercard
	 3 Issuer (customer’s bank) approves payment
	  4 Money moves from issuer → acquirer → merchant
 * 
 * 
 */
/**
 * how we can parse the response using API.
 * Parsing = reading the API response and extracting the required values.
 * 
{
  "status": "success",
  "data": {
    "id": 101,
    "name": "John",
    "roles": ["admin", "editor"]
  }
}
//RestAssured :
///
///
// Parse values
        String name = res.jsonPath().getString("data.name");
        int id = res.jsonPath().getInt("data.id");

        System.out.println(name);
        System.out.println(id);
List<String> roles = res.jsonPath().getList("data.roles");
//Parsing the response : 
///
let response = pm.response.json();
pm.globals.set("user_id", response.data.id);

 * 	
 * 
 * what type of validation you have perform on API
 * 
int userId = given().when().get("/user").jsonPath().getInt("data.id");

given()
  .pathParam("id", userId)
  .when()
  .get("/user/{id}")
  .then()
  .statusCode(200);
``

SAfe Null Pointer Exception in 
String email = jp.getString("email") != null ? jp.getString("email") : "no email";

 */
	/**
	 * Automate a test case when:
	 * 
	 * 1. The test is repeated frequently :-
	Regression tests
	Smoke/sanity suites
	Tests run in every build or sprint

	2. The test is time‑consuming or tedious for humans
	Manual execution takes long (e.g., 1000 data inputs).
	Automation saves time and reduces human error.

	3.The test is stable and has predictable results
	If the functionality does not change frequently, it’s a good automation candidate.

	4.4. The test is critical for business

	Login
	Payment workflows
	Checkout flows
	API contract tests
	5. The test requires multiple data combinations
	Data‑driven tests (e.g., form validation) are perfect for automation.

	6. The test is technical or requires precise validation

	API response validation
	Performance metrics
	Database checks

	7. The environment supports automation
	Stable UI locators, accessible APIs, CI/CD pipeline support = good automation candidate.



	 * 
	 * 
	 * 
	 * 	
	 */
	
	
}
