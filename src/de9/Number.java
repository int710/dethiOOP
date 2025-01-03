package de9;

import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Number {
    private int a;
    private int b;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị số a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá trị số b: ");
        b = Integer.parseInt(sc.nextLine());
    }
    
    public int cong() {
        return a+b;
    }
    
    public int tru() {
        return a-b;
    }
    
    public int nhan() {
        return a*b;
    }
    
    public Double chia() {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }
    
    public int timUCLN() {
        int x = a;
        int y = b;
        while(y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
    
    public String writeResult() {
        return "Số A: " + a + ", Số B: " + b + ", Ước chung lớn nhất: " + this.timUCLN();
    }
}
