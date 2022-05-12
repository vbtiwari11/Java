import java.util.*;
public class Array_conacate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3};
		int a2[]= {4,5,6};
		int length=a1.length+a2.length,pos=0;
		int[] res=new int[length];
		for (int item : a1) {
			res[pos]=item;
			pos++;
		}
		for ( int item: a2) {
			res[pos]=item;
			pos++;
		}
		for (int i : res) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(res));
		
		
	}

}
