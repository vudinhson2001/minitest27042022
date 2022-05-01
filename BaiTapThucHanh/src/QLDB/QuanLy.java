package QLDB;

public interface QuanLy<T> {
    void print();

    void add(T t);

    void update(int phone , T t);

    void delete(String name);

    int search(String name);
}
