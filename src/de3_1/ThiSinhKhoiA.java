
package de3_1;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhKhoiA extends ThiSinh {
    private float diemToan;
    private float diemHoa;
    private float diemLy;

    public ThiSinhKhoiA(float diemToan, float diemHoa, float diemLy, String hoTen, String truongHoc, String sbd, float diemCong) {
        super(hoTen, truongHoc, sbd, diemCong);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemLy = diemLy;
    }

    public ThiSinhKhoiA() {
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    @Override
    public float tinhDiem() {
        return ((diemToan * 2 + diemLy + diemHoa) / 4) + super.getDiemCong();
    }

    @Override
    public String inThongTin() {
        return "ThiSinhKhoiA{" + "diemToan=" + diemToan + ", diemHoa=" + diemHoa + ", diemLy=" + diemLy + '}';
    }

}
