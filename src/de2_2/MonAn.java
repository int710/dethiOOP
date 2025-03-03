
package de2_2;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class MonAn extends MatHang {
    private boolean canTrinhDien;

    public MonAn(boolean canTrinhDien, String ten, String id, int soLuong, double giaVon) {
        super(ten, id, soLuong, giaVon);
        this.canTrinhDien = canTrinhDien;
    }

    public boolean isCanTrinhDien() {
        return canTrinhDien;
    }

    public void setCanTrinhDien(boolean canTrinhDien) {
        this.canTrinhDien = canTrinhDien;
    }

    @Override
    public double tinhGiaTrenMenu() {
        return super.getGiaVon() / TY_LE_GIA_VON + (canTrinhDien ? 200000 : 0);
    }

    @Override
    public String inThongTin() {
        return toString() + " | Có cần trình diễn: " + (canTrinhDien ? "Có" : "Không");
    }
}
