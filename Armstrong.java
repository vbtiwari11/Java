import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num,arm=0,temp,l_d;
		System.out.println("Enter the number");
		num=scan.nextInt();
		temp=num;
		while(temp!=0) {
			l_d=temp%10;
			arm+=l_d*l_d*l_d;
			temp=temp/10;
		}
		if(arm==num) {
			System.out.println("Armstrong found!!");
		}
		else {
			System.out.println("Sorry no Armstrong");
		}
	}
}
