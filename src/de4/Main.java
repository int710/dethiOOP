
package de4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Main {
    public static void main(String[] args) {
        SieuThi sieuThi = new SieuThi();

        // Thêm sản phẩm mẫu
        sieuThi.addAProduct(new SanPham("SP01", "Sữa", 25.0, "2023-01-01"), 100);
        sieuThi.addAProduct(new SanPham("SP02", "Bánh mì", 10.0, "2023-01-05"), 50);

        // Thêm khách hàng mẫu
        // Thêm khách hàng mẫu
        KhachHang khach1 = new KhachHang("KH01", "Alice", 1990, new Address("Tổ 4", "Văn Hiến", "Long Châu", "Hà Nội"));
        KhachHang khach2 = new KhachHang("KH02", "Bob", 1985, new Address("Phố PRO", "Văn Vở", "Ngọc Bich", "Hà Nội"));

        sieuThi.addACustomer(khach1);
        sieuThi.addACustomer(khach2);

// In danh sách sản phẩm
        System.out.println("Danh sách sản phẩm:");
        sieuThi.displayAllProduct();

// Cập nhật thông tin khách hàng
        boolean isUpdated = sieuThi.updateCustomer("KH01", "Alice Nguyen", 1991);
        if (isUpdated) {
            System.out.println("Thông tin khách hàng KH01 đã được cập nhật.");
        } else {
            System.out.println("Không tìm thấy khách hàng KH01.");
        }

// Tạo hóa đơn
        Map<SanPham, Integer> danhSachMua = new HashMap<>();
        danhSachMua.put(new SanPham("SP01", "Sữa", 25.0, "2023-01-01"), 2);
        danhSachMua.put(new SanPham("SP02", "Bánh mì", 10.0, "2023-01-05"), 3);
        sieuThi.createOrder(khach1, danhSachMua);

// In danh sách sản phẩm sau khi mua
        System.out.println("Danh sách sản phẩm sau khi mua:");
        sieuThi.displayAllProduct();

// In hóa đơn
        System.out.println("Hóa đơn:");
        sieuThi.displayOrders();
    }
}

