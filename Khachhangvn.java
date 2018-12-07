
package Hoadontiendien;

public class Khachhangvn extends Khachhang {
    private String doituong;
    private int dinhmuc;

    public Khachhangvn(String doituong, int dinhmuc,String makh, String hoten, String ngayrahoadon, int soluong, int dongia) {
        super( makh,  hoten,  ngayrahoadon, soluong, dongia);
        this.doituong = doituong;
        this.dinhmuc = dinhmuc;
    }

    public Khachhangvn() {
        super();
        this.doituong ="";
        this.dinhmuc = 0;
    }
    

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
    
    @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.doituong+"\t\t";
        st+=this.dinhmuc+"\t\t";
        return st;
        
    }    
    
           
}
