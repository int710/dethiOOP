package de3;

import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhKhoiC extends ThiSinh {
    private float diemVan;
    private float diemSu;
    private float diemDia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(float diemVan, float diemSu, float diemDia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public float tongDiem() {
        return this.diemVan + this.diemSu + this.diemDia; 
    }
    
    @Override
    public void nhapThongTinThiSinh() {
        super.nhapThongTinThiSinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn Văn: ");
        this.diemVan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm môn Sử: ");
        this.diemSu = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm môn Địa: ");
        this.diemDia = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void inThongTinThiSinh() {
        super.inThongTinThiSinh();
        System.out.printf("Điểm Văn: %.2f, Điểm Sử: %.2f, Điểm Địa: %.2f%n", diemVan, diemSu, diemDia);
    }
}
