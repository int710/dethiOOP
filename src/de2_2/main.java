package de2_2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class main {

    public static void main(String[] args) throws IOException {
        ArrayList<MatHang> dsMatHang = FileIO.docFile("./src/de2_2/mathang.txt");

        for (MatHang x : dsMatHang) {
            System.out.println(x.inThongTin());
        }
    }
}
