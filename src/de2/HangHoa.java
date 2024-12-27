package de2;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class HangHoa implements Serializable{
    private static final long SerialVersionUID = 1L;
    private String maHang;
    private String tenSP;
    private double giaBan;

    public HangHoa() {
    }

    
    public HangHoa(String maHang, String tenSP, double giaBan) {
        this.maHang = maHang;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void hienThiThongTin() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
    }

}
