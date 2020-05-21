package tutorial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_examples
{
	public static void main(String[] args)
	{
		String str = "Hello. It is a string for the test!";
		Map str_map = get_map(str);
		
		System.out.println(str_map);
	}
	
	public static Map get_map(String str)
	{
		Map map = new LinkedHashMap();
		char[] str_arr = str.toCharArray();
		
		for (int i = 0, len = str.length(); i < len; i++) {
			int val = (map.containsKey(str_arr[i]))? (int) map.get(str_arr[i]) + 1 : 1;
			map.put(str_arr[i], val);
		}
		
		return map;
	}
}