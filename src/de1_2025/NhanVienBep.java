
package de1_2025;

import static de1_2025.NhanVien.LUONG_GIO;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class NhanVienBep extends NhanVien {
    private boolean isBepTruong;
    private double thuongChucVu;

    public NhanVienBep(boolean isBepTruong, double thuongChucVu, String hoTen, String queQuan, int thamNien, double soGioLamViec) {
        super(hoTen, queQuan, thamNien, soGioLamViec);
        this.isBepTruong = isBepTruong;
        this.thuongChucVu = thuongChucVu;
    }

    public boolean isIsBepTruong() {
        return isBepTruong;
    }

    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }

    public double getThuongChucVu() {
        return thuongChucVu;
    }

    public void setThuongChucVu(double thuongChucVu) {
        this.thuongChucVu = thuongChucVu;
    }
    
    
    
    @Override
    public double tinhLuong() {
        return getSoGioLamViec() * LUONG_GIO + (isBepTruong ? thuongChucVu : 0);
    }

    @Override
    public String toString() {
        return "Nhân viên bếp: " +
                    "Họ tên: " + getHoTen() + " | " +
                    "Thâm niên: " + getThamNien() + " | " +
                    "Quê quán: " + getQueQuan() + " | " +
                    "Số giờ làm việc: " + getSoGioLamViec() + " | " +
                    "Bếp trưởng: " + isBepTruong + " | " +
                    "Thưởng chức vụ: " + thuongChucVu + " | " +
                    "Lương: " + tinhLuong();
    }
}
