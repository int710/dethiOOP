package de2_2025;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public abstract class ThiSinh {
    private String hoTen;
    private String sbd;
    private String truongHoc;
    private float diemCong;
    protected static final float DIEM_SAN = 3;

    public ThiSinh(String hoTen, String sbd, String truongHoc, float diemCong) {
        this.hoTen = hoTen;
        this.sbd = sbd;
        this.truongHoc = truongHoc;
        this.diemCong = diemCong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }

    public float getDiemCong() {
        return diemCong;
    }

    public void setDiemCong(float diemCong) {
        this.diemCong = diemCong;
    }
    
    public abstract String hienThiThongTin();
    public abstract float tinhDiem();
}
