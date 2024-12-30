package de3;

import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    
    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void nhapThongTinThiSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh (dd/mm/yy): ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
    }
    
    public void inThongTinThiSinh() {
        System.out.printf("Thông tin thí sinh \n Họ tên: %10s, Ngày sinh: %10s, Đia chỉ: %10s", hoTen, ngaySinh, diaChi);
    }

//    abstract public float tongDiem();
}
