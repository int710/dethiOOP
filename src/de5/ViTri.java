package de5;

/**
 *
 * @author Admin
 */
public enum ViTri {
    THU_MON("Thủ môn"),
    HAU_VE("Hậu vệ"),
    TIEN_VE("Tiền vệ"),
    TIEN_DAO("Tiền Đạo");
    
    private final String tenViTri;

    private ViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }
    
    public static ViTri findByName(String name) {
        for(ViTri vt : ViTri.values()) {
            if(vt.tenViTri.equalsIgnoreCase(name)) return vt;
        }
        return null;
    }
}
