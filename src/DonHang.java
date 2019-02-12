import java.util.ArrayList;
import java.util.Scanner;

public class DonHang {
    public int ID;
    public double tongTien;
    ArrayList<SanPham> DanhSachSP;

    public DonHang(int ID, double tongTien, ArrayList<SanPham> danhSachSP) {
        this.ID = ID;
        this.tongTien = tongTien;
        DanhSachSP = danhSachSP;
    }
    public void AddSanPham(SanPham sp){
   if(sp.CheckSL()>0){
       System.out.println("Thêm "+ sp.ten +" Thành công");
DanhSachSP.add(sp);
   }
   else {
       System.out.println("Sản phẩm "+sp.ten+" đã hết hàng rồi ");
   }
    }
    public void AddSanPham(SanPham sp,int giamGia){
        if(sp.CheckSL()>0){
            sp.gia = (sp.gia/100*giamGia);
            System.out.println("Thêm "+ sp.ten +" Thành công");
            DanhSachSP.add(sp);
        }
        else {
            System.out.println("Sản phẩm "+sp.ten+" đã hết hàng rồi ");
        }
    }
}
