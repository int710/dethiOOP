package de2_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class FileIO {

    public static ArrayList<MatHang> docFile(String filePath) throws FileNotFoundException, IOException {
        ArrayList<MatHang> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals("MonAn")) {
                    list.add(new MonAn(Boolean.parseBoolean(data[5]),
                                data[1],
                                data[2],
                                Integer.parseInt(data[3]),
                                Double.parseDouble(data[4])));
                } else {
                    list.add(new DoUong(Boolean.parseBoolean(data[5]),
                                data[1],
                                data[2],
                                Integer.parseInt(data[3]),
                                Double.parseDouble(data[4])));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    // save data to file 
    public static boolean saveToFile(String filePath, ArrayList<MatHang> ds) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (MatHang sp : ds) {
                bw.write(sp.inThongTin());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
