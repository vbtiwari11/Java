import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n,i,flag=0,m=0;
		System.out.println("enter the number:");
		n=scan.nextInt();
		m=n/2;
		if(n==0 || n==1) {
			System.out.println("Number is not prime");
		}
		else {
			for(i=2;i<=m;i++) {
				if (m%i==0) {
					break;
				}
				else {
					flag=1;
				}
			}
		}
		
		if (flag==1){
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}
		
	}

}
