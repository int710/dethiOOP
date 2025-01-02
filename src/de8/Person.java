package de8;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Person {
    private String fullName;
    private String dob;
    private String address;
    private String gender;

    public Person() {
    }

    public Person(String fullName, String dob, String address, String gender) {
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }
    
    public void displayInfo() {
        System.out.printf("Họ tên: %-5s | Ngày sinh: %-5s | Địa chỉ: %-5s | Giới tính: %-2s | ",
                    fullName, dob, address, gender);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
    
}
