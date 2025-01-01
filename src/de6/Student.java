
package de6;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Student extends Person implements Serializable{
    private static final long serialVersionUID = 1L; 
    private int studentId;
    private String email;
    private float gpa;

    public Student(int studentId, String email, float gpa, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.studentId = studentId;
        this.email = email;
        this.gpa = gpa;
    }

    public Student() {
    }
    
    
    public Student(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.printf("Mã sinh viên: %3d | Email: %5s | GPA: %.2f \n", studentId, email, gpa);
    }
}
