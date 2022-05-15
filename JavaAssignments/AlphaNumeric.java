
public class AlphaNumeric {
	static String getNbr(String str) 
    { 
        // Replace each non-numeric number with a space
        str = str.replaceAll("[^\\d]", " "); 
        // Remove leading and trailing spaces
        str = str.trim(); 
        // Replace consecutive spaces with a single space
        str = str.replaceAll(" +", " "); 
  
        return str; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "123ert 5689yu 978njh 7"; 
	        System.out.print(getNbr(str));

	}

}
