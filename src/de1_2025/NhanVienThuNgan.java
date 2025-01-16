
package de1_2025;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class NhanVienThuNgan extends NhanVien {
    private boolean isBietNgoaiNgu;

    public NhanVienThuNgan(boolean isBietNgoaiNgu, String hoTen, String queQuan, int thamNien, double soGioLamViec) {
        super(hoTen, queQuan, thamNien, soGioLamViec);
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }
    
    
    public boolean isIsBietNgoaiNgu() {
        return isBietNgoaiNgu;
    }

    public void setIsBietNgoaiNgu(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    @Override
    public double tinhLuong() {
        return LUONG_GIO * getSoGioLamViec();
    }

    @Override
    public String toString() {
        return "Nhân viên bếp: " +
                    "Họ tên: " + getHoTen() + " | " +
                    "Thâm niên: " + getThamNien() + " | " +
                    "Quê quán: " + getQueQuan() + " | " +
                    "Số giờ làm việc: " + getSoGioLamViec() + " | " +
                    "Biết ngoại ngữ: " + isBietNgoaiNgu + " | " +
                    "Lương: " + tinhLuong();
    }
}
