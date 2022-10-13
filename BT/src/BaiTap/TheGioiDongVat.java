package BaiTap;

import java.util.*;

class dongvat{
	protected String thucan;
	protected String cannang;
	dongvat(){
		
	}
	dongvat(String a, String b)
	{
		thucan=a;
		cannang=b;
	}
	public String getThucan() {
		return thucan;
	}
	public void setThucan(String thucan) {
		this.thucan = thucan;
	}
	public String getCannang() {
		return cannang;
	}
	public void setCannang(String cannang) {
		this.cannang = cannang;
	}
	public String toString() {
		return "thuc an: "+thucan+", can nang: "+cannang;
	}
	void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Nhap thuc an: ");
		thucan=sc.nextLine();
		System.out.println("Nhap can nang: ");
		cannang=sc.nextLine();
	}
	void in() {
		System.out.println(", thuc an: "+thucan+", can nang: "+cannang);
	}
}

class meo extends dongvat{
	private String ten;
	private String tuoi;
	meo(){}
	meo(String c, String d){
		ten=c;
		tuoi=d;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String toString() {
		return "ten: "+ ten+ ", tuoi: "+tuoi+", thuc an: "+thucan+", can nang: "+cannang+" -> Tao la MEO";
	}
	void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Nhap ten: ");
		ten=sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi=sc.nextLine();
		super.nhap();
	}
	void in() {
		super.in();
		System.out.println("ten: "+ ten+ ", tuoi: "+tuoi+", thuc an: "+thucan+", can nang: "+cannang+" -> Tao la Meo");
	}
}
class cho extends dongvat{
	private String loai;
	cho(){
		
	}
	cho(String e)
	{
		loai=e;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String toString() {
		return "loai: "+loai+", thuc an: "+thucan+", can nang: "+cannang+" -> Tao la CHO";
	}
	void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Nhap loai: ");
		loai=sc.nextLine();
		super.nhap();
	}
	void in() {
		super.in();
		System.out.println("loai: "+ loai+ ", thuc an: "+thucan+", can nang: "+cannang+" -> Tao la CHO");
	}
}
public class TheGioiDongVat {

	public static void main(String[] args) {
		ArrayList<dongvat> g = new ArrayList<dongvat>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong dong vat: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int chon;
			System.out.println("Chon Meo hay Cho (0/1)?");
			chon = sc.nextInt();
			if(chon == 0) {
				meo m = new meo();
				m.nhap();
				g.add(m);
			}
			else if(chon == 1) {
				cho q = new cho();
				q.nhap();
				g.add(q);
			}
		}
		for(int i=0;i<g.size();i++) {
			System.out.println(g.get(i));
		}
		
	}

}
