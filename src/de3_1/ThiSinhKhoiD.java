
package de3_1;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhKhoiD extends ThiSinh {
    private float diemToan;
    private float diemVan;
    private float diemAnh;

    public ThiSinhKhoiD(float diemToan, float diemVan, float diemAnh, String hoTen, String truongHoc, String sbd, float diemCong) {
        super(hoTen, truongHoc, sbd, diemCong);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }


    public ThiSinhKhoiD() {
    }

    public float getDiemToan() {
        return diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(float diemAnh) {
        this.diemAnh = diemAnh;
    }

    
    @Override
    public float tinhDiem() {
        return ((diemAnh * 2 + diemToan + diemVan) / 4) + super.getDiemCong();
    }

    @Override
    public String inThongTin() {
        return "ThiSinhKhoiD{" + "diemToan=" + diemToan + ", diemVan=" + diemVan + ", diemAnh=" + diemAnh + '}';
    }

}
