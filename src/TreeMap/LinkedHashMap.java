package TreeMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Student 1");
        Student student10 = new Student(10,"Student 10");
        Student student2 = new Student(2,"Student 2");
        Student student5 = new Student(5,"Student 5");
        Student student4 = new Student(4,"Student 4");

        Map<Integer,Student> map = new TreeMap<Integer,Student>();
        map.put(student1.getId(),student1);
        map.put(student2.getId(),student2);
        map.put(student5.getId(),student5);
        map.put(student4.getId(),student4);
        map.put(student10.getId(),student10);
        for (Integer key : map.keySet()) {
            Student value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("---------------");
        for (Entry<Integer,Student> entry: map.entrySet()) {
            Integer key= entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);

        }
    }
}
