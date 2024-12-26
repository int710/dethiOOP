package deso1_2324;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class FileIO {
    public static void saveToFile(String filePath, GiangVien gv) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath)) {
            oos.writeObject(gv.toString);
        }
    }
}
