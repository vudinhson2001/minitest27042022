package TreeMap;

public class Student {
    private int id;
    private String Name;

    public Student(int id, String name) {
        this.id = id;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student { " +
                "id = " + id +
                ", Name = '" + Name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
