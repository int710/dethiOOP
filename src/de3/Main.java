package de3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ThiSinh> dsThiSinh = new ArrayList<>();

        System.out.print("Số lượng sinh viên muốn nhập vào?: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Chọn khối (A hoặc C): ");
            String luaChon = sc.nextLine();

            if (luaChon.equalsIgnoreCase("A")) {
                ThiSinhKhoiA tsA = new ThiSinhKhoiA();
                tsA.nhapThongTinThiSinh();
                dsThiSinh.add(tsA);
            } else if (luaChon.equalsIgnoreCase("C")) {
                ThiSinhKhoiC tsC = new ThiSinhKhoiC();
                tsC.nhapThongTinThiSinh();
                dsThiSinh.add(tsC);
            } else {
                System.out.println("Lựa chọn khối không phù hợp, vui lòng kiểm tra lại!");
                i--; // Giảm chỉ số để yêu cầu nhập lại
            }
        }

        System.out.println("\nDanh sách thí sinh trúng tuyển (Tổng điểm > 20):");
        boolean coThiSinhTrungTuyen = false;

        for (ThiSinh thiSinh : dsThiSinh) {
            if (thiSinh instanceof ThiSinhKhoiA) {
                ThiSinhKhoiA ts = (ThiSinhKhoiA) thiSinh;
                if (ts.tongDiem() > 20) {
                    ts.inThongTinThiSinh();
                    coThiSinhTrungTuyen = true;
                }
            } else if (thiSinh instanceof ThiSinhKhoiC) {
                ThiSinhKhoiC ts = (ThiSinhKhoiC) thiSinh;
                if (ts.tongDiem() > 20) {
                    ts.inThongTinThiSinh();
                    coThiSinhTrungTuyen = true;
                }
            }
        }

        if (!coThiSinhTrungTuyen) {
            System.out.println("Không có thí sinh nào trúng tuyển.");
        }
    }
}