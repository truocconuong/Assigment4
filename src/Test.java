import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham(1,"Sữa",18.0,5);
        SanPham sp2 = new SanPham(1,"Thạch",12.0,2);
        SanPham sp3 = new SanPham(1,"Mỳ tôm",5.0,0);
        ArrayList<SanPham>arrays = new ArrayList<>();
        DonHang dh1 = new DonHang(1,0.0,arrays);
        dh1.AddSanPham(sp1,50);
        dh1.AddSanPham(sp2);
        dh1.AddSanPham(sp3);
        System.out.println("-----------------------------");
        // in ra danh sách sản phẩm
        double result = 0;
        System.out.println("Danh sách sản phẩm có trong kho hàng là ");
        for(int i = 0 ;i<arrays.size();i++){
            System.out.println(arrays.get(i).ten);
            result = result + arrays.get(i).gia;
        }
        System.out.println("Tổng tiền của đơn hàng là "+result);
    }
}
