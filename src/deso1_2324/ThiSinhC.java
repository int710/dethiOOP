package deso1_2324;

import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhC extends ThiSinh{

    private float diemVan;
    private float diemSu;
    private float diemDia;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Văn: ");
        this.diemVan = scanner.nextFloat();
        System.out.print("Nhập điểm Sử: ");
        this.diemSu = scanner.nextFloat();
        System.out.print("Nhập điểm Địa: ");
        this.diemDia = scanner.nextFloat();
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Điểm Văn: " + diemVan);
        System.out.println("Điểm Sử: " + diemSu);
        System.out.println("Điểm Địa: " + diemDia);
    }

}
