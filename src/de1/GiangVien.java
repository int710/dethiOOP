package de1;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class GiangVien {

    private String id;
    private String maGV;
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private String khoa;

    public GiangVien(String id, String maGV, String hoTen, String diaChi, String gioiTinh, String khoa) {
        this.id = id;
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Mã GV: " + maGV  + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Giới tính: " + gioiTinh + ", Khoa: " + khoa;
    }
    
    public String toStringWriteFile() {
        return id + "," + maGV  + "," + hoTen + "," + diaChi + "," + gioiTinh + "," + khoa;
    }
    
}
