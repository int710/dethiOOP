
package at1601_21;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private String ngaySanXuat;

    public SanPham(String maSP, String tenSP, double donGia, String ngaySanXuat) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    
    
}
