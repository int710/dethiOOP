
package de2_2;

import static de2_2.MatHang.TY_LE_GIA_VON;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class DoUong extends MatHang {
    private boolean doNong;

    public DoUong(boolean doNong, String ten, String id, int soLuong, double giaVon) {
        super(ten, id, soLuong, giaVon);
        this.doNong = doNong;
    }

    public boolean isDoNong() {
        return doNong;
    }

    public void setDoNong(boolean doNong) {
        this.doNong = doNong;
    }

    @Override
    public double tinhGiaTrenMenu() {
        return super.getGiaVon() / TY_LE_GIA_VON;
    }

    @Override
    public String inThongTin() {
        return toString() + " | Đồ uống nóng: " + (doNong ? "Có" : "Không");
    }
}
