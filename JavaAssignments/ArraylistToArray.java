import java.util.*;
public class ArraylistToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l1=new ArrayList <Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		Integer[] arr=new Integer[l1.size()];
		// using object
		//arr=l1.toArray(arr);
		for(int i=0;i<l1.size();i++) {
			arr[i]=l1.get(i);
		}
		System.out.println("Converted array from arralist");
		for(int item:arr) {
			System.out.println(item);
		}
		List l11=Arrays.asList(arr);
		System.out.println("COnverted list from array "+ l11);
		
	}

}
