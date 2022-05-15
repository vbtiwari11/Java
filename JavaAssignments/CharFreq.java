import java.util.*;
public class CharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="abcd efghi abcd";
		int freq[]=new int[sen.length()];
		int i;
		char string[] = sen.toCharArray(); 
		
		int d_c=0,c=0;
		for( i=0;i<sen.length();++i) {
			freq[i]=1;
			for(int j=i+1;j<sen.length();j++) {
				if (string[i]==string[j]) {
					freq[i]++;
					string[j]='0';
			}
			
		}
	
	}
		System.out.println("Characters and their corresponding frequencies");    
        for( i = 0; i <freq.length; i++) {    
            if(string[i] != ' ' && string[i] != '0')    
                System.out.println(string[i] + "-" + freq[i]);    
        }    
        
	

}
}
