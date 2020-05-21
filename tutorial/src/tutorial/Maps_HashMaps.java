package tutorial;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Maps_HashMaps {

	public static void main(String[] args) {
		/** 
		 * Maps are equal to dictionaries in Python.
		 * A very fast data structure.
		 */
		
		// HashMap() - doesn't care about an order so that's why it's faster than TreeMap.
        // keys of a HashMap can be different types (int or char of whatever).
		Map hm = new HashMap();
		hm.put("Danil", 17);
		hm.put(17, "Danil");
		hm.put(17, "Overwrite"); // doesn't create a new key-value pair
		//                         but overwrite the old value if the key is the same.
		
		System.out.println(hm.get("Danil"));
		System.out.println(hm.get(17));
		System.out.println(hm);
		
		// TreeMap() - keeps a dictionary in a sorted order.
		// The keys has to be the same datatype.
		Map tm = new TreeMap();
		tm.put("Danil", 17);
		tm.put("17", "Danil");
		tm.put("17", "Overwrite");
		tm.put("z", "a");
		tm.put("a", "z");
		
		System.out.println(tm.get("Danil"));
		System.out.println(tm.get("17"));
		System.out.println(tm);
		
		// LinkedHashMap() - the same as HashMap() except that 
		// it keeps the same order we add things into it.
		Map lhm = new LinkedHashMap();
		lhm.put("Danil", 17);
		lhm.put(17, "Danil");
		lhm.put(17, "Overwrite");
		lhm.put("z", "a");
		lhm.put("a", "z");
		
		System.out.println(lhm.get("Danil"));
		System.out.println(lhm.get(17));
		System.out.println(lhm);
		
		/*** following methods are applied to all kind of mMaps: ***/
		boolean cv = hm.containsValue(17);
		boolean ck = hm.containsKey(17);
		System.out.println(cv);
		System.out.println(ck);
		
		System.out.println(hm.values());
		
		boolean ie = hm.isEmpty();
		System.out.println(ie);
		
		System.out.println(hm);
		hm.remove(17);
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
	}

}
