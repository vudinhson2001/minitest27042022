package TreeMap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class LuyenTap {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "Mazda");
        map.put(2, "Honda");
        map.put(3, "Mercedes");
        //Hiển Thị Map
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("------------");
        for (Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}