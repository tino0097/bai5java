
package Hoadontiendien;

public class Khachhang {
    private String makh;
    private String hoten;
    private String ngayrahoadon;
    private int soluong;
    private int dongia;

    public Khachhang(String makh, String hoten, String ngayrahoadon, int soluong, int dongia) {
        this.makh = makh;
        this.hoten = hoten;
        this.ngayrahoadon = ngayrahoadon;
        this.soluong = soluong;
        this.dongia = dongia;
    }
   
        public Khachhang() {
        this.makh = "";
        this.hoten = "";
        this.ngayrahoadon = "";
        this.soluong = 0;
        this.dongia = 0;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgayrahoadon() {
        return ngayrahoadon;
    }

    public void setNgayrahoadon(String ngayrahoadon) {
        this.ngayrahoadon = ngayrahoadon;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    
    @Override
    public String toString(){
        String st="";
        st+=this.makh+"\t\t";
        st+=this.hoten+"\t\t";
        st+=this.ngayrahoadon+"\t\t";
        st+=this.soluong+"\t\t";
        st+=this.dongia+"\t\t";
        return st;
        
    }
    
           
}
