import java.util.*;
public class Average_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n,i,length;

		System.out.println("Enter the size:");
		n=scan.nextInt();
		int [] array1=new int[n];
		System.out.println("Enter the number");
		for(i=0;i<n;i++) {
			
			int value=scan.nextInt();
			array1[i]=value;
		}
		int sum=0;
		for (i=0;i<n;i++) {
			sum+=array1[i];
		}
		float avg=sum/n;
		System.out.println("Average is:"+avg);
		
	}

}
