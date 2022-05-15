
public class CountConVow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vow=0,cons=0;
		String sen="This is java code";
		sen=sen.toLowerCase();
		for(int i=0;i<sen.length();i++) {
			if (sen.charAt(i)=='a'|| sen.charAt(i)=='e'|| 
					sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u'
			){
					vow+=1;
			}
			else {
				cons+=1;
			}
		}
		
		System.out.println("The vowel count:"+vow);
		System.out.println("The cons count:"+cons);

	}

}
