
package de5;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class CauThu implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String hoTen;
    private String namSinh;
    private ViTri viTri;

    public CauThu(int id, String hoTen, String namSinh, ViTri viTri) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }
    
    public void displayInfo() {
        System.out.printf("Cầu thủ \nID: %-2d, Họ tên: %-10s, Năm sinh: %-5s, Vị trí: %s \n", id, hoTen,namSinh,viTri.getTenViTri());
    }
}
