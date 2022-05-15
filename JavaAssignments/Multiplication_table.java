import java.util.*;
public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num,i,res=1;
		System.out.println("Enter num for it's table:");
		num=scan.nextInt();
		for(i=1;i<=10;i++) {
			res=num*i;
			System.out.println(num+"*"+i+"="+res);
		}
	}

}
