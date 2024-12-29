
package at1601_21;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private int namSinh;
    private Address diaChi;

    public KhachHang(String maKH, String tenKH, int namSinh, Address diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public Address getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(Address diaChi) {
        this.diaChi = diaChi;
    }
    
}
