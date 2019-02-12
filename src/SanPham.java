public class SanPham {
    public int ID;
    public String ten;
    public double gia;
    public int SL;

    public SanPham() {
    }

    public SanPham(int ID, String ten, double gia, int SL) {
        this.ID = ID;
        this.ten = ten;
        this.gia = gia;
        this.SL = SL;
    }
    public int CheckSL(){
      return this.SL;
    }
}
