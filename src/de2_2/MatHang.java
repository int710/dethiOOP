
package de2_2;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public abstract class MatHang {
    private String ten;
    private String id;
    private int soLuong;
    private double giaVon;
    protected static final double TY_LE_GIA_VON = 0.4;

    public MatHang(String ten, String id, int soLuong, double giaVon) {
        this.ten = ten;
        this.id = id;
        this.soLuong = soLuong;
        this.giaVon = giaVon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(double giaVon) {
        this.giaVon = giaVon;
    }
    
    public abstract double tinhGiaTrenMenu();
    public abstract String inThongTin();

    @Override
    public String toString() {
        return "MatHang{" + "ten=" + ten + ", id=" + id + ", soLuong=" + soLuong + ", giaVon=" + giaVon + '}';
    }
}
