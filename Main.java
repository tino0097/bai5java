
package Hoadontiendien;

public class Main {
    public static void main(String[] args) {
        Quanly ql=new Quanly();
        ql.nhapkhvn();
        System.out.println("THANH TIEN: "+ql.thanhtienvn());
        ql.tongsoluongdienkhvn();
        ql.hoadonthang9vn();
        
        ql.nhapkhnn();
        System.out.println("TB THANH TIEN: "+ql.tbthanhtiennn());
        ql.tongsoluongdienkhnn();
        ql.hoadonthang9nn();
    }
}
