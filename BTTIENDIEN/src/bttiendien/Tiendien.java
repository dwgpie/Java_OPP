package bttiendien;

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
	
	public KHACHHANG(String a, String b, int c, int e, int f) {
		this.makh=a;
		this.hoten=b;
		this.ngayhoadon=c;
		this.soluongdien=e;
		this.dongia=f;
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

	public int getDonggia() {
		return dongia;
	}

	public void setDonggia(int donggia) {
		this.dongia = donggia;
	}


	public String toString() {
		return "MAKH: " + makh + ", TEN: " + hoten + ", NGAY: " + ngayhoadon +  ", SOLUONGDIEN: " + soluongdien + ", DONGIA: " + dongia ;
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
	KHVIETNAM(String a, String b, int c, int e, int f,String doituongK,int dinhmuc){
		super(a,b,c,e,f);
		this.doituongKH=doituongKH;
		this.dinhmuc=dinhmuc;
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
		System.out.println("DOITUONGKH: "+doituongKH);
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
	KHNUOCNGOAI(String a, String b, int c, int e, int f,String quoctich){
		super(a,b,c,e,f);
		this.quoctich=quoctich;
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
		System.out.println("QUOCTICH: "+quoctich);
	}
	@Override
	public int TinhThanhTien() {
		
		return soluongdien*dongia;
	}
	
}
class DSKHACHHANG{
	  ArrayList<KHACHHANG> L = new ArrayList<KHACHHANG>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong KH: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int chon;
			System.out.println("KHVIETNAM OR KHNUOCNGOAI (0/1)?");
			chon = sc.nextInt();
			if(chon == 0) {
				KHVIETNAM vn = new KHVIETNAM();
				vn.nhap();
				L.add(vn);
			}
			else if(chon == 1) {
				KHNUOCNGOAI nn = new KHNUOCNGOAI();
				nn.nhap();
				L.add(nn);
			}
		}
		for(int i=0;i<L.size();i++) {
			System.out.println(L.get(i));
		}
}
public class Tiendien {

	public static void main(String[] args) {
		
		
		
	}

}
