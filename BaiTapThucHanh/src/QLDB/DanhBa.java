package QLDB;

public class DanhBa {
    private String name ;
    private int phone ;
    private String address ;
    private String email ;

    public DanhBa() {
    }

    public DanhBa(String name, int phone, String address, String email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "QuanLyDanhBa{" +
                "name = '" + name + '\'' +
                ", phone = " + phone +
                ", address = '" + address + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }
}
