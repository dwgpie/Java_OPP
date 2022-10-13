package vidu;


import java.util.*;

interface ITIENDIEN{
	int TinhThanhTien();
}
 abstract class KHACHHANG{
	protected  String makh;
	protected String hoten;
	protected int ngayhoadon;
	protected int soluongdien;
	protected int  dongia;
	protected int price;
	public KHACHHANG(){}
	public KHACHHANG(String a, String b, int c, int e, int f,int k) {
		this.makh=a;
		this.hoten=b;
		this.ngayhoadon=c;
		this.soluongdien=e;
		this.dongia=f;
		this.price=k;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public  String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNgayhoadon() {
		return ngayhoadon;
	}

	public void setNgayhoadon(int ngayhoadon) {
		this.ngayhoadon = ngayhoadon;
	}


	public int getSoluongdien() {
		return soluongdien;
	}

	public void setSoluongdien(int soluongdien) {
		this.soluongdien = soluongdien;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int donggia) {
		this.dongia = donggia;
	}

	public int TinhThanhTien() {
		return price;
	}
	public String toString() {
		return "MAKH: " + makh + ", TEN: " + hoten + ", NGAY: " + ngayhoadon +  ", SOLUONGDIEN: " + soluongdien + ", DONGIA: " + dongia +", THANHTIEN: "+price;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter MAKH: ");
		this.makh = sc.nextLine();
		System.out.println("Enter TEN: ");
		this.hoten = sc.nextLine();
		System.out.println("Enter NGAY: ");
		this.ngayhoadon = sc.nextInt();
		System.out.println("Enter SOLUONGDIEN: ");
		this.soluongdien = sc.nextInt();
		System.out.println("Enter DONGIA: ");
		this.dongia = sc.nextInt();
	}
	void in() {
		System.out.println("MAKH: " + makh + ", TEN: " + hoten + ", NGAY: " + ngayhoadon +", SOLUONGDIEN: " + soluongdien + ", DONGIA: " + dongia );
	}
	
}
  class KHVIETNAM extends KHACHHANG implements ITIENDIEN{
	
	private String doituongKH;
	private int dinhmuc;
	 KHVIETNAM() {
		
	}
	KHVIETNAM(String a, String b, int c, int e, int f,int k,String doituongK,int dinhmuc){
		super(a,b,c,e,f,k);
		
		this.doituongKH=doituongKH;
		this.dinhmuc=dinhmuc;
	}
	
	@Override
	public String toString() {
		return super.toString() +", KHVIETNAM: "  + doituongKH + ", DINHMUC: " + dinhmuc ;
	}
	public String getDoituongKH() {
		return doituongKH;
	}
	public void setDoituongKH(String doituongKH) {
		this.doituongKH = doituongKH;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Enter DOITUONGKH:");
		doituongKH=sc.nextLine();
		System.out.println("Enter DINHMUC:");
		dinhmuc=sc.nextInt();
	}
	void in() {
		super.in();
		System.out.println(",DOITUONGKH: "+doituongKH+", DINHMUC: "+dinhmuc);
	}
	@Override
	public int TinhThanhTien() {
		if(soluongdien<dinhmuc)
		{
			return soluongdien*dongia;
		}
		else
		{
			return (int) (soluongdien*dongia*dinhmuc+(soluongdien-dinhmuc)*dongia*2.5);
		}
	}
	
	
}
  
  class KHNUOCNGOAI extends KHACHHANG implements ITIENDIEN{
		
	private String quoctich;
     KHNUOCNGOAI() {
		
	}
	KHNUOCNGOAI(String a, String b, int c, int e, int f,int k,String quoctich){
		super(a,b,c,e,f,k);
		this.quoctich=quoctich;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", KHNUOCNGOAI: " + quoctich ;
	}
	public String getQuoctich() {
		return quoctich;
	}
	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Enter QUOCTICH:");
		quoctich=sc.nextLine();
	}
	void in() {
		super.in();
		System.out.println(", QUOCTICH: "+quoctich);
	}
	@Override
	public int TinhThanhTien() {
		
		return soluongdien*dongia;
	}
	
}
class DSKHACHHANG{
	private KHACHHANG[] kh;
	private int n;
	Scanner sc = new Scanner(System.in);
	
	public DSKHACHHANG() {
		System.out.println("Nhap so luong khach hang: ");
		n = sc.nextInt();
		kh = new KHACHHANG[n];
		
		for(int i=0; i<n; i++) {
			kh[i] = new KHACHHANG(){};
		}
	}
	
	public void nhapKH() {
	
		
		int choose;
		System.out.println("KHVN or KHNN (1/2)?");
		choose = sc.nextInt();
		for(int i=0; i<n; i++) {
			if(choose == 1) {
				kh[i] = new KHVIETNAM();
				kh[i].nhap();
				kh[i].price = kh[i].TinhThanhTien();
			} else if(choose == 2) {
				kh[i] = new KHNUOCNGOAI();
				kh[i].nhap();
				kh[i].price = kh[i].TinhThanhTien();
			} else {
				System.out.println("Lua chon khong hop le!!");
			}
		}
	}
	public void hienthiKH() {
		for(int i=0; i<n; i++) {
			System.out.println(kh[i].toString());
		}
	}
	
}
public class BTtinhtiendien {

	public static void main(String[] args) {
		DSKHACHHANG l=new DSKHACHHANG();
		l.nhapKH();
		l.hienthiKH();
		
	
		
	
	}
}


