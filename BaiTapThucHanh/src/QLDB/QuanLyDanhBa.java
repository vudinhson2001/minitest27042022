package QLDB;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa implements QuanLy<DanhBa> {
    List<DanhBa> danhBaList = new ArrayList<>();
    public List<DanhBa> getDanhBaList(){
        return danhBaList ;
    }

    @Override
    public void print() {
        for (int i = 0; i < danhBaList.size(); i++) {
            System.out.println(danhBaList.get(i));
        }
    }

    @Override
    public void add(DanhBa danhBa) {
        danhBaList.add(danhBa);
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getName().equals(name)) {
                System.out.println(danhBaList.get(i));
                return i;
            }
        }

        return -1;
    }

    @Override
    public void update( int phone, DanhBa danhBa) {
        int index0f = searchPhone(phone);
        if (index0f == -1) {
            System.out.println("khong co sdt nay ");
        } else {
            danhBaList.set(index0f, danhBa);
        }

    }
    public int searchPhone(int phone) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getPhone()==phone) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(String name) {
        int indexOfName=search(name);
       if(indexOfName==-1){
           System.out.println("ko tìm thấy tên");
       }
       else {
           danhBaList.remove(indexOfName);
       }
    }
}
