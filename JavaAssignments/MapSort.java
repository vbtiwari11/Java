import java.util.Map.Entry;
import java.util.*;

public class MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> bts=new LinkedHashMap<>();
		bts.put(1, "RM");
		bts.put(2, "Jin");
		bts.put(3, "Suga");
		bts.put(4, "Jh");
		bts.put(5, "Jm");
		bts.put(6, "V");
		bts.put(7, "JK");
		Map <Integer,String> result=sortMap(bts);
		for (Map.Entry entry : result.entrySet()) {
		      System.out.print("Key: " + entry.getKey());
		      System.out.println(" Value: " + entry.getValue());
		}
		
		
		

	}

	private static LinkedHashMap sortMap(LinkedHashMap map) {
		// TODO Auto-generated method stub

		List <Entry<Integer, String>> Bts_name = new LinkedList<>(map.entrySet());
		Collections.sort(Bts_name, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

	    // create a new map
	    LinkedHashMap<Integer, String> result = new LinkedHashMap();

	    // get entry from list to the map
	    for (Map.Entry<Integer, String> entry : Bts_name) {
	      result.put(entry.getKey(), entry.getValue());
	    }

	    return result;

	}

}
