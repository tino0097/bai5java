
package Hoadontiendien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Quanly {
    ArrayList<Khachhangvn> listkhvn=new ArrayList();
    ArrayList<Khachhangnn> listkhnn=new ArrayList();
    Scanner sc=new Scanner(System.in);
    
    public Khachhangvn khvietnam(){
        String makh=sc.nextLine();
        String hoten=sc.nextLine();
        String ngayrahoadon=sc.nextLine();
        String doituong=sc.nextLine();
        int soluong=sc.nextInt();
        int dongia=sc.nextInt();
        int dinhmuc=sc.nextInt();
        Khachhangvn khvn=new Khachhangvn( doituong, dinhmuc, makh,  hoten, ngayrahoadon, soluong, dongia);
        return khvn;
    }
    
    public void nhapkhvn(){
        String traloi;
        do
        {
            this.listkhvn.add(this.khvietnam());
            System.out.println("MOI BAN NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
    }
    
    
        public Khachhangnn khnuocngoai(){
        String makh=sc.nextLine();
        String hoten=sc.nextLine();
        String ngayrahoadon=sc.nextLine();
        String quoctich=sc.nextLine();
        int soluong=sc.nextInt();
        int dongia=sc.nextInt();
        Khachhangnn khnn=new Khachhangnn( quoctich, makh, hoten, ngayrahoadon ,soluong, dongia);
        return khnn;
    }
    
    public void nhapkhnn(){
        String traloi;
        do
        {
            this.listkhnn.add(this.khnuocngoai());
            System.out.println("MOI BAN NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
    }
    
    
    public double thanhtienvn(){
        double b;
        for(int i=0;i<listkhvn.size();i++){
            if(listkhvn.get(i).getSoluong()<=listkhvn.get(i).getDinhmuc())
            {
                int a=listkhvn.get(i).getSoluong()*listkhvn.get(i).getDongia();
                return a;
            }
            else
            {
               b= (double)(listkhvn.get(i).getSoluong()*listkhvn.get(i).getDongia()
                        +(listkhvn.get(i).getSoluong()-listkhvn.get(i).getDinhmuc())*listkhvn.get(i).getDongia()*2.5);
               return b;
            }
        }
        return 0;
    }
    

  public void hoadonthang9vn()  {
      SimpleDateFormat sp=new SimpleDateFormat("MM-yyyy");
      Calendar cal =Calendar.getInstance();
      Date date1;
      Date date2;
      try {
      for(int i=0;i<listkhvn.size();i++){
      String ngaynhap="09-2013";
      String ngayhienthi=listkhvn.get(i).getNgayrahoadon();   
      date1=sp.parse(ngaynhap);  
      date2=sp.parse(ngayhienthi);
      if(date1.compareTo(date2)==0)
      {
          System.out.println(listkhvn.get(i).toString());
      }
      }
       } catch (ParseException ex) {
        }
  }
   
  
    public void hoadonthang9nn()  {
      SimpleDateFormat sp=new SimpleDateFormat("MM-yyyy");
      Calendar cal =Calendar.getInstance();
      Date date1;
      Date date2;
      try {
      for(int i=0;i<listkhnn.size();i++){
      String ngaynhap="09-2013";
      String ngayhienthi=listkhnn.get(i).getNgayrahoadon();   
      date1=sp.parse(ngaynhap);  
      date2=sp.parse(ngayhienthi);
      if(date1.compareTo(date2)==0)
      {
          System.out.println(listkhnn.get(i).toString());
      }
      }
       } catch (ParseException ex) {
        }
  }
        public double tbthanhtiennn(){
        double b=0;
        for(int i=0;i<listkhnn.size();i++){
            int a=listkhvn.get(i).getSoluong()*listkhvn.get(i).getDongia();
            b+=a;   
        }
        return (double)(b/listkhnn.size());
    }
    
    
    public int tongsoluongdienkhvn(){
        int b=0;
        for(int i=0;i<listkhvn.size();i++){
            int a=listkhvn.get(i).getSoluong();
            b+=a;  
        }
        return b;
    }
    
    
    public int tongsoluongdienkhnn(){
        int b=0;
        for(int i=0;i<listkhnn.size();i++){
            int a=listkhnn.get(i).getSoluong();
            b+=a;  
        }
        return b;
    }
}
