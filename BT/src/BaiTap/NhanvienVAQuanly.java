package BaiTap;
import java.util.*;

class nv{
	protected String name;
	protected double hsl;
	protected double luong;
	nv(){
		
	}
	nv(String a, double b, double c){
		this.name=a;
		this.hsl=b;
		this.luong=c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHsl() {
		return hsl;
	}
	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public String toString() {
		return "name: " + name + ", hsl: " + hsl + ", luongnv: " + luong;
	}
	void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap name: ");
		name = sc.nextLine();
		System.out.println("Nhap hsl: ");
		hsl = sc.nextDouble();
		sc.nextLine();
		setLuong(getHsl()*1500);
	}
	void in() {
		System.out.println("name: " + name + ", hsl: " + hsl + ", luongnv: " + getLuong());
	}
}



class ql extends nv{
	private String chucvu;
	private double phucap;
	ql(){
		
	}
	ql(String c, double d){
		this.chucvu=c;
		this.phucap=d;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public double getPhucap() {
		return phucap;
	}
	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}
	public String toString() {
		return "name: " + name + ", hsl: " + hsl + ", chucvu: " + chucvu + ", phucap: " + phucap + ", luong=" + luong;
	}
	
	void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chucvu: ");
		chucvu = sc.nextLine();
		System.out.println("Nhap phucap: ");
		phucap = sc.nextDouble();
		sc.nextLine();
		setLuong(getHsl()*1500 + phucap);
	}
	void in() {
		super.in();
		System.out.println("name: " + name + ", hsl: " + hsl + ", chucvu: " + chucvu + ", phucap: " + phucap + ", luong=" + getLuong());
	}
}

public class NhanvienVAQuanly {

	public static void main(String[] args) {
		ArrayList<nv> g = new ArrayList<nv>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong nguoi: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int chon;
			System.out.println("Chon nhan vien hoac quan ly (0/1)?");
			chon = sc.nextInt();
			if(chon == 0) {
				nv e = new nv();
				e.nhap();
				g.add(e);
			}
			else if(chon == 1) {
				ql q = new ql();
				q.nhap();
				g.add(q);
			}
		}
		for(int i=0;i<g.size();i++) {
			System.out.println(g.get(i));
		}
		System.out.println("=================SAP XEP TEN==================");
		g.sort(Comparator.comparing(nv::getName));
		for(int i=0;i<g.size();i++) {
			System.out.println(g.get(i));
		}
		System.out.println("=================SAP XEP LUONG==================");
		g.sort(Comparator.comparing(nv::getLuong));
		for(int i=0;i<g.size();i++) {
			System.out.println(g.get(i));
		}
	}
}

