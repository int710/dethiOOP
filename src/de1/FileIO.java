package de1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static boolean saveToFile(String filePath, GiangVien gv) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(gv.toStringWriteFile()+ "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Lỗi viết file: " + e.getMessage());
            return false;
        }
    }

    public static String checkDuplicate(List<GiangVien> dsGiangVien, String maGv, String Id) {
        for (GiangVien gv : dsGiangVien) {
            if (gv.getMaGV().equalsIgnoreCase(maGv)) {
                return "Mã giảng viên đã tồn tại";
            }
            if (gv.getId().equalsIgnoreCase(Id)) {
                return "ID giảng viên đã tồn tại";
            }
        }
        return null; // Không có trùng lặp
    }

    public static List<GiangVien> getAll(String filePath) {
        List<GiangVien> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 6) {
                    list.add(new GiangVien(values[0], values[1], values[2], values[3], values[4], values[5]));
                } else {
                    System.out.println("Dòng dữ liệu không hợp lệ: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        return list;
    }

    public static GiangVien searchGV(List<GiangVien> list, String hoTen) {
        for (GiangVien gv : list) {
            if (gv.getHoTen().equals(hoTen)) {
                return gv;
            }
        }
        return null;
    }
}
