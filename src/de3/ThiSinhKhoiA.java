package de3;

import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhKhoiA extends ThiSinh {
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public ThiSinhKhoiA() {
    }
    
    public ThiSinhKhoiA(float diemToan, float diemLy, float diemHoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
//    @Override
    public float tongDiem() {
        return this.diemHoa + this.diemLy + this.diemToan;
    }

    @Override
    public void nhapThongTinThiSinh() {
        super.nhapThongTinThiSinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán: ");
        this.diemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm môn Lý: ");
        this.diemLy = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm môn Hóa: ");
        this.diemHoa = Float.parseFloat(sc.nextLine());
    }
    
    @Override
    public void inThongTinThiSinh() {
        super.inThongTinThiSinh();
        System.out.printf("Điểm Toán: %.2f, Điểm Lý: %.2f, Điểm Hóa: %.2f%n", diemToan, diemLy, diemHoa);
    }
}
