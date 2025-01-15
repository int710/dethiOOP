package deontap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.ietf.jgss.Oid;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class File {
    // Hàm đọc và ghi dữ liệu vào file 
    public static void saveToFile(String filePath, ArrayList<Book> ds) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(ds);
            JOptionPane.showMessageDialog(null, "Đã lưu dữ liệu thành công vào file " + filePath);
        } catch (IOException ex) {
            System.out.println("Lỗi khi lưu dữ liệu vào file: " + ex.getMessage());
        }
    }
    
    public static ArrayList<Book> readFormFile(String filePath) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
            ois.close();
            return list;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Lỗi khi đọc dữ liệu từ file: " + ex.getMessage());
            return new ArrayList<>();
        }
    }
}
