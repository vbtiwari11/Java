import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n,temp,rev=0,rem;
		System.out.println("Enter the number");
		n=scan.nextInt();
		temp=n;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("The reverse is"+rev);
	}

}
