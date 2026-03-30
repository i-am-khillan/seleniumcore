package java8featureLamda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class CaptureListMaxValues {
	public static void main(String[] args) {
		
	
	//A= {6,2,4,0,0,0,0} 
	//B= {3,1,5} 
	//Output = {1,2,3,4,5,6} 
Integer []	A= {6,2,4,0,0,0,0} ;
Integer []	B= {3,1,5};

/*
 * Integer [] result=Arrays.stream(A) .map(val ->val==0 ? null:val) .flatMap(val
 * ->val==null ?Arrays.stream(B).limit(1) :Arrays.stream(new Integer[] {val})
 * .sorted() .toArray(Integer[]::new) );
 */

Integer[] res=Stream.concat(Arrays.stream(A).filter(x->x!=0), Arrays.stream(B)).sorted().toArray(Integer[] ::new);

System.out.println(Arrays.toString(res));

}
}