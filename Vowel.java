import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		char inp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character:");
		inp=scan.next().charAt(0);

        if (inp == 'a' || inp == 'e' || inp == 'i' || inp == 'o'
            || inp == 'u' || inp == 'A' || inp == 'E' || inp == 'I'
            || inp == 'O' || inp == 'U') {
        	System.out.println("The given char is vowel");
        }
        else {
        	System.out.println("The given char is consonant");
        }
		
	}

}
