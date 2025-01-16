package de1_2025;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public abstract class NhanVien {
    private String hoTen;
    private String queQuan;
    private int thamNien;
    private double soGioLamViec;
    protected static final double LUONG_GIO = 100000;

    public NhanVien(String hoTen, String queQuan, int thamNien, double soGioLamViec) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.thamNien = thamNien;
        this.soGioLamViec = soGioLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
        
    public abstract double tinhLuong();
    public abstract String toString();
}
