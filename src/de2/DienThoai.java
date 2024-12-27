package de2;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class DienThoai extends HangHoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nhaSanXuat;
    private int dungLuongBoNho;
    private String mauSac;

    public DienThoai() {
        super();
    }
    
    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String mauSac, String maHang, String tenSP, double giaBan) {
        super(maHang, tenSP, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Dung lượng bộ nhớ: " + dungLuongBoNho + "GB");
        System.out.println("Màu sắc: " + mauSac);
    }

    @Override
    public String toString() {
        return "DienThoai: " + "Mã Sản Phẩm: " + super.getMaHang() + ", Tên Sản Phẩm: " + super.getTenSP() + ", Giá bán: " + super.getGiaBan() 
                    + "NSX: " + nhaSanXuat + ", Dung Lượng Bộ Nhớ: " + dungLuongBoNho + ", Màu Sắc: " + mauSac;
    }
    
    
}
