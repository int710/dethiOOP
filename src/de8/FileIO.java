package de8;

import de8.NhanVien;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableStringConverter;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class FileIO {
    public static ArrayList<NhanVien> readFile(String filePath) throws FileNotFoundException, IOException {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while((line = br.readLine()) != null) {
                String[] result = line.split("\\$");
                dsNhanVien.add(new NhanVien(result[4], Double.parseDouble(result[5]), result[6], result[0], result[1], result[2], result[3]));
            }
        } catch(IOException e) {
            System.err.println("Lỗi khi đọc dữ liệu");
        }
        return dsNhanVien;
    }
    
    public static void hienThiDanhSach(ArrayList<NhanVien> danhSachNhanVien) {
        System.out.printf("%-20s %-12s %-20s %-10s %-12s %-10s %-15s%n", 
            "Họ Tên", "Ngày Sinh", "Địa Chỉ", "Giới Tính", "Mã NV", "HSL", "Đơn Vị");
        System.out.println("-------------------------------------------------------------------------------");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.printf("%-20s %-12s %-20s %-10s %-12s %-10.2f %-15s%n",
                nv.getFullName(), nv.getDob(), nv.getAddress(), nv.getGender(),
                nv.getIdNV(), nv.getHeSoLuong(), nv.getDonVi());
        }
    }
    
    public static void showTable(ArrayList<NhanVien> listNV) {
        UI ui = new UI();
        JTable table = ui.getTable();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        
        for(NhanVien nv : listNV) {
            dtm.addRow(nv.toArray());
        }
        
        table.setModel(dtm);
        ui.setVisible(true);
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<NhanVien> dsNhanVien = null;
        Scanner sc = new Scanner(System.in);
        final String FILE_PATH = "./src/de8/nhanvien.dat";
        
        dsNhanVien = readFile(FILE_PATH);
       
        hienThiDanhSach(dsNhanVien);
        
        System.out.println("Nhập chữ Y/N [Yes/No] để hiển thị bảng: ");
        String choice = sc.nextLine().trim();
        
        if(choice.equalsIgnoreCase("y")) {
            showTable(dsNhanVien);
        }
    }
}
