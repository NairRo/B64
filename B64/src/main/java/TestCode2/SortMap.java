package TestCode2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap();
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap();
		ArrayList<String> list = new ArrayList<>();
		
		map.put(2, "B");
        map.put(8, "A");
        map.put(4, "D");
        map.put(7, "F");
        map.put(6, "W");
        map.put(19, "J");
        map.put(1, "Z");
        
        System.out.println("Map: " + map);
        
        for (Entry<Integer, String> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        Collections.sort(list, new Comparator<String>() {
            public int compare(String str, String str1) {
                return (str).compareTo(str1);
            }
        });
        
        System.out.println("Ordered list: " + list);
        for (String str : list) {
            for (Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        System.out.println("Sorted Map: " + sortedMap);
	}

}
