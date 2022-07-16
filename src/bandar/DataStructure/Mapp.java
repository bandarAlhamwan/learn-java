package bandar.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "bandar");
		map.put(2, "Reema");
		map.put(3, "Saud");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
		
		System.out.println(map.keySet());
		
		for (int key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		map.forEach((k,v) ->{
			System.out.println(k + " _ " + v);
		});
	}
}
