import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		n1=scn.nextInt();
		if (n1%2==0) {
			System.out.println("You've entered even number");
		}
		else {
			System.out.println("You've entered odd number");
		}
		scn.close();
	}

}
