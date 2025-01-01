package de6;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Person implements Serializable{
    private static final long SerialVersionUID = 1L;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public Person() {
    }
    
     
    public void displayInfo() {
        System.out.printf("Họ tên: %-7s | Ngày sinh: %-5s | Địa chỉ: %-7s | Giới tính: %-3s | ", hoTen, ngaySinh, diaChi, gioiTinh);
    }
}
