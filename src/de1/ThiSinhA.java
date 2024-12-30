
package de1;

import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class ThiSinhA extends ThiSinh {
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Toán: ");
        this.diemToan = scanner.nextFloat();
        System.out.print("Nhập điểm Lý: ");
        this.diemLy = scanner.nextFloat();
        System.out.print("Nhập điểm Hóa: ");
        this.diemHoa = scanner.nextFloat();
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
    }
}
