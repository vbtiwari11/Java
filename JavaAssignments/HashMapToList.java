import java.util.*;
public class HashMapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m1=new HashMap<>();
		m1.put(1,"RM");
		m1.put(2, "Jin");
		m1.put(3, "Suga");
		Set<Integer> keySet = m1.keySet();
		System.out.println(keySet);
		Collection <String> valueSet=m1.values();
		System.out.println(valueSet);
		ArrayList<Integer> keys=new ArrayList<Integer>(keySet);
		ArrayList<String> values=new ArrayList<String>(valueSet);
		System.out.println("Key list-"+keys);
		System.out.println("Value List-"+values);
		
		
		
	}

}
