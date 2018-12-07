
package Hoadontiendien;

public class Khachhangnn extends Khachhang {
    private String quoctich;

    public Khachhangnn(String quoctich,String makh, String hoten, String ngayrahoadon, int soluong, int dongia) {
        super( makh,  hoten,  ngayrahoadon, soluong, dongia);
        this.quoctich = quoctich;
    }

    public Khachhangnn() {
        super();
        this.quoctich = "";
    }
    

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    
    @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.quoctich+"\t\t";
        return st;
        
    }    
}
