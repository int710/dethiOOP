package at1601_21;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class HoaDon {

    private KhachHang khachHang;
    private Map<SanPham, Integer> products; // lưu trữ danh sách sản phẩm và số lượng
    private double totalAmount;

    public HoaDon(KhachHang khachHang) {
        this.khachHang = khachHang;
        this.products = new HashMap<>();
        this.totalAmount = 0;
    }

    public void addProduct(SanPham sp, int soLuong) {
        products.put(sp, products.getOrDefault(sp, 0) + soLuong);
        // products.getOrDefault(sp, 0) method getOrDefault() của Map hoạt động như sau:
        // Nếu (key) đã tồn tại trong products, nó sẽ trả về giá trị (số lượng) hiện tại của sản phẩm đó.
        // Nếu key (sp) chưa tồn tại trong products, nó sẽ trả về giá trị mặc định được chỉ định, trong trường hợp này là 0
        calculateTotal(); // tính lại tiền hàng
    }

    private void calculateTotal() {
        // Duyệt qua các sp trong cart, lấy số lượng nhân với đơn giá
        for (Map.Entry<SanPham, Integer> entry : products.entrySet()) {
            this.totalAmount += entry.getValue() * entry.getKey().getDonGia();
        }
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public Map<SanPham, Integer> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
