package de7;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class SinhVien {
    private String hoTen;
    private String maSinhVien;
    private float diemQT;
    private float diemHP;

    public SinhVien() {
    }
    
    public SinhVien(String hoTen, String maSinhVien, float diemQT, float diemHP) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.diemQT = diemQT;
        this.diemHP = diemHP;
    }
    
    public float diemTB() {
        return (float) (diemQT * 0.3 + diemHP * 0.7);
    }
    
    public void displayInfo() {
        System.out.printf("Mã sinh viên: %-5s | Họ tên: %-5s | Điểm Quá Trình: %.2f | Điểm Học Phần: %.2f | Điểm Trung Bình: %.2f",
                    maSinhVien, hoTen, diemQT, diemHP, diemTB());
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public float getDiemQT() {
        return diemQT;
    }

    public float getDiemHP() {
        return diemHP;
    }
    
}