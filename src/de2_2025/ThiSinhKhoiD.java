package de2_2025;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhKhoiD extends ThiSinh {

    private float diemToan;
    private float diemVan;
    private float diemAnh;

    public ThiSinhKhoiD(float diemToan, float diemVan, float diemAnh, String hoTen, String sbd, String truongHoc, float diemCong) {
        super(hoTen, sbd, truongHoc, diemCong);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
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
        return ((diemToan + diemVan + diemAnh * 2) / 4) + getDiemCong();
    }

    @Override
    public String hienThiThongTin() {
        return "Thí sinh khối D: "
                    + "Họ tên: " + getHoTen() + " | "
                    + "SBD: " + getSbd() + " | "
                    + "Trường học: " + getTruongHoc() + " | "
                    + "Điểm cộng: " + getDiemCong() + " | "
                    + "Điểm toán: " + getDiemToan() + ", Điểm văn: " + getDiemVan() + ", Điểm anh: " + getDiemAnh() + " | "
                    + "Tổng điểm: " + tinhDiem() + " | ";
    }
}
