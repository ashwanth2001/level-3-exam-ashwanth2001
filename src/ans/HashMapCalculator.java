package ans;
import java.util.*;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		Set<String> keySet = hashmap1.keySet();
		String[] save = new String[hashmap1.size()];
		keySet.toArray(save);
		
		int total = 0;
		for(int i = 0; i<save.length; i++) {
			String s1 = hashmap1.get(save[i]);
			String s2 = hashmap2.get(save[i]);
			if(s1.equals(s2))
				total++;
			System.out.println(s1 + ", " + s2);
		}
		System.out.println("total = " + total + "\n");
		return total;
	}
}
