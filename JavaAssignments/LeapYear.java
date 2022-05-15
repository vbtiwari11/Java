import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int year;
		boolean leap;
		System.out.println("Enter the year:");
		year=scan.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%4==0) 
					leap=true;
				else
					leap=false;
			}
			else
				leap=true;
		}
		else
			leap=false;
		
		if(leap) {
			System.out.println("leap");
		}
		else {
			System.out.println("Not a leap");
		}
}
}
