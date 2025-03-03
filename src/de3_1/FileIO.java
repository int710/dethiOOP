package de3_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class FileIO {

    public static boolean saveToFile(String filePath, ArrayList<ThiSinh> ds) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (ThiSinh ts : ds) {
                bw.write(ts.inThongTin());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
