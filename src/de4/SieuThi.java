package de4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de4.HoaDon;

public class SieuThi {

    private List<KhachHang> customers;
    private Map<SanPham, Integer> products;
    private List<HoaDon> orders;

    public SieuThi() {
        this.customers = new ArrayList<>();
        this.products = new HashMap<>();
        this.orders = new ArrayList<>();
    }

    // Thêm mới một sản phẩm vào siêu thị, đã có thì update số lượng còn chưa thì thêm mới
    public void addAProduct(SanPham sp, Integer soLuong) {
        if (products.containsKey(sp)) {
            products.put(sp, products.get(sp) + soLuong);
        } else {
            products.put(sp, soLuong);
        }
    }

    // Thêm mới một khách hàng
    public void addACustomer(KhachHang khachHang) {
        customers.add(khachHang);
    }

    // Cập nhật lại tên/năm sinh
    public boolean updateCustomer(String maKH, String tenMoi, int namSinhMoi) {
        for (KhachHang u : customers) {
            if (maKH.equals(u.getMaKH())) {
                u.setTenKH(tenMoi);
                u.setNamSinh(namSinhMoi);
                return true;
            }
        }
        return false;
    }

    // Hiển thị toàn bộ danh sách sản phẩm
    public void displayAllProduct() {
        for (Map.Entry<SanPham, Integer> entry : products.entrySet()) {
            String tenSP = entry.getKey().getTenSP();
            System.out.println("Tên sản phẩm: " + tenSP + ", Số lượng: " + entry.getValue());
        }
    }

    // Tìm kiếm sản phẩm dựa trên mã sản phẩm
    public SanPham findSanPham(String maSP) {
        for (SanPham sp : products.keySet()) {
            if (sp.getMaSP().equals(maSP)) {
                return sp;
            }
        }
        return null;
    }

    // Tạo hóa đơn khi mua sản phẩm
    public void createOrder(KhachHang customer, Map<SanPham, Integer> listSP) {
        HoaDon order = new HoaDon(customer);
        for (Map.Entry<SanPham, Integer> entry : listSP.entrySet()) {
            SanPham sp = findSanPham(entry.getKey().getMaSP());
            if (sp != null && products.containsKey(sp)) {
                int soLuongConLai = products.get(sp) - entry.getValue();
                if (soLuongConLai >= 0) {
                    order.addProduct(sp, entry.getValue());
                    products.put(sp, soLuongConLai);
                } else {
                    System.out.println("Số lượng hàng " + sp.getTenSP() + " không đủ để bán.");
                }
            } else {
                System.out.println("Sản phẩm " + entry.getKey().getTenSP() + " không có trong siêu thị.");
            }
        }
        orders.add(order);
    }

    // Hiển thị hóa đơn
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Không có hóa đơn nào.");
            return;
        }

        for (HoaDon order : orders) {
            System.out.println("======================================");
            System.out.println("Mã khách hàng: " + order.getKhachHang().getMaKH());
            System.out.println("Tên khách hàng: " + order.getKhachHang().getTenKH());
            System.out.println("Danh sách sản phẩm:");

            double total = 0;
            for (Map.Entry<SanPham, Integer> entry : order.getProducts().entrySet()) {
                SanPham product = entry.getKey();
                int quantity = entry.getValue();
                double subtotal = product.getDonGia() * quantity;
                total += subtotal;

                System.out.printf("  - Tên sản phẩm: %s, Số lượng: %d, Giá: %.2f, Thành tiền: %.2f\n",
                    product.getTenSP(),
                    quantity,
                    product.getDonGia(),
                    subtotal);
            }

            System.out.printf("Tổng giá trị hóa đơn: %.2f\n Total final: %.2f", total, order.getTotalAmount());
        }
    }
}