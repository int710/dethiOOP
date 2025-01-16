
package de2_2025;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhKhoiA extends ThiSinh {
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public ThiSinhKhoiA(float diemToan, float diemLy, float diemHoa, String hoTen, String sbd, String truongHoc, float diemCong) {
        super(hoTen, sbd, truongHoc, diemCong);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    @Override
    public float tinhDiem() {
        return ((diemToan*2 + diemLy + diemHoa) / 4) + getDiemCong();
    }

    @Override
    public String hienThiThongTin() {
        return "Thí sinh khối A: "
                    + "Họ tên: " + getHoTen() + " | "
                    + "SBD: " + getSbd() + " | "
                    + "Trường học: " + getTruongHoc() + " | "
                    + "Điểm cộng: " + getDiemCong() + " | "
                    + "Điểm toán: " + getDiemToan() + ", Điểm lý: " + getDiemLy()+ ", Điểm hóa: " + getDiemHoa() + " | "
                    + "Tổng điểm: " + tinhDiem() + " | ";
    }

}
