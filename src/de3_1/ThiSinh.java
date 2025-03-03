package de3_1;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public abstract class ThiSinh {
    private String hoTen;
    private String truongHoc;
    private String sbd;
    private float diemCong;
    private static final float DIEM_SAN = 3;

    public ThiSinh(String hoTen, String truongHoc, String sbd, float diemCong) {
        this.hoTen = hoTen;
        this.truongHoc = truongHoc;
        this.sbd = sbd;
        this.diemCong = diemCong;
    }

    public ThiSinh() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public float getDiemCong() {
        return diemCong;
    }

    public void setDiemCong(float diemCong) {
        this.diemCong = diemCong;
    }
    
    public abstract float tinhDiem();
    public abstract String inThongTin();
}
