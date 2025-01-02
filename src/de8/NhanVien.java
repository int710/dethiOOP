package de8;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class NhanVien extends Person {

    private String idNV;
    private double heSoLuong;
    private String donVi;

    public NhanVien() {
    }

    public NhanVien(String idNV, double heSoLuong, String donVi, String fullName, String dob, String address, String gender) {
        super(fullName, dob, address, gender);
        this.idNV = idNV;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("ID Nhân viên: %s | Hệ số lương: %.2f | Đơn vị: %s \n", idNV, heSoLuong, donVi);
    }

    public String getIdNV() {
        return idNV;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public String getDonVi() {
        return donVi;
    }
    
     public String[] toArray() {
        return new String[]{super.getFullName(), super.getDob(), super.getAddress(), super.getGender(), idNV, String.valueOf(heSoLuong), donVi};
    }
}
