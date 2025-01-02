package de7;

import java.util.ArrayList;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class LopHoc {
    private ArrayList<SinhVien> dsSinhVien;
    private int siSo;
    private String tenLop;

    public LopHoc(int siSo, String tenLop) {
        this.dsSinhVien = new ArrayList<>();
        this.siSo = siSo;
        this.tenLop = tenLop;
    }
    
    public boolean themSinhVien(SinhVien sv) {
        if(dsSinhVien.size() < siSo) {
            dsSinhVien.add(sv);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public int getSiSo() {
        return siSo;
    }
    
}    
