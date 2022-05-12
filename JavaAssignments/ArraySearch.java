import java.util.*;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] a1= {1,2,3,4,5,6,7,8};
		int len=a1.length,i;
		int flag=0;
		System.out.println("Enter the search number:");
		int n=scan.nextInt();
		for(i=0;i<len;i++) {
			if(a1[i]==n) {
				flag=1;
				break;
				
			}
			else {
				flag=0;
				
			}
		}
		if(flag==1) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
