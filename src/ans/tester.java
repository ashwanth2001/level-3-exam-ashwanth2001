package ans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class tester {

	public static void main(String[] args) {
		HashMap<String, String> hashmap1 = new HashMap<String, String>();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Chuck", "Fine");
		hashmap1.put("Felix", "Sick");

		HashMap<String, String> hashmap2 = new HashMap<String, String>();
		hashmap2.put("Mary", "Ecstatic");
		hashmap2.put("Felix", "Healthy");
		hashmap2.put("Ricardo", "Superb");
		hashmap2.put("Tam", "Fine");
		hashmap2.put("Bob", "Happy");
		
		Set<String> s = hashmap1.keySet();
		String[] save = new String[hashmap1.size()];
		s.toArray(save);
		
		int total = 0;
		for(int i = 0; i<save.length; i++) {
			String s2 = hashmap1.get(save[i]);
			String s3 = hashmap2.get(save[i]);
			if(s2.equals(s3))
				total++;
			System.out.println(s2 + ", " + s3);
		}
		System.out.println(total);
	}
}
