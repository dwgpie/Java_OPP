package vidu;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


class employee{
	String ten;
	double luong;
	
	employee() {}
	
	employee(String ten, double luong){
		this.ten = ten;
		this.luong = luong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public String toString() {
		return ten + ", " + luong;
	}
	void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten:"); 
		ten=sc.nextLine();
		System.out.println("Nhap luong:"); 
		luong=sc.nextDouble();
	}
	void xuat() {
		System.out.println(ten + ", " + luong);
	}
	
} 
 class manager extends employee{
	String phongban;
	double phucap;
	
	manager() {}
	
	manager(String ten, double luong, String phongban, double phucap){
		super(ten ,luong);
		this.phongban = phongban;
		this.phucap = phucap;
	}
	public String getPhongban() {
		return phongban;
	}
	public void setPhongban(String phongban) {
		this.phongban = phongban;
	}
	public double getPhucap() {
		return phucap;
	}
	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}
	public String toString() {
		return phongban+","+phucap;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap phong ban:"); 
		phongban=sc.nextLine();
		System.out.println("Nhap phu cap:"); 
		phucap=sc.nextDouble();
	}
	void xuat() {
		System.out.println("\nThong tin Quan Ly: ");
		super.xuat();
		System.out.println(phongban + ", " + phucap);
	}
	void calSalary() {
		super.setLuong(luong*1500 + phucap);
		System.out.println("Luong Quan Li: " + luong);
	}
 }	
 class ALL{
	
		ArrayList <manager> L= new ArrayList<manager>();
		void nhap() {
			Scanner sc=new Scanner(System.in);
			int chon;
			int x;
			do {
				System.out.println("Nhap Nhan vien hay Quan li (1/0) ?");
				chon = sc.nextInt();
				
				if(chon == 1) {
					employee e = new employee();
					e.nhap();
				} else if (chon == 0){
					manager m = new manager();
					m.nhap();
				}
				
				System.out.println("Tiep tuc khong? (0/1)");
				x = sc.nextInt();
				if(x == 0) break;
			
			} while(true);
		}
		void xuat() {
			Scanner sc=new Scanner(System.in);
			employee e = new employee();
			manager m = new manager();
			System.out.println("Ban muon in nhan vien hay quan ly(1/0)?");
			int tl=sc.nextInt();
			employee p;
			if(tl==1)
			{
				p=e;
			}
			else
			{
				p=m;
			}
			p.xuat();

		}
 }
// class ALL2 extends employee{
//	 int n=2;
//		ArrayList <employee> L= new ArrayList<employee>();
//		void nhap() {
//			Scanner sc=new Scanner(System.in);
//			for(int i=0;i<n;i++)
//			{
//				System.out.println("Nhap nhan vien thu "+(i+1)+" :");
//				employee e= new employee();
//				e.nhap();
//				L.add(e);
//			}
//		}
//		void xuat() {
//			System.out.println("\nDanh sach nhan vien:");
//			for(int i=0;i<n;i++)
//			{
//				System.out.println(L.get(i));
//			}
//		}
// }
public class bt {

	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		employee e = new employee();
		manager m = new manager();
		ALL a=new ALL();
		a.nhap();
		a.xuat();
		
		
//		System.out.println("Ban muon in nhan vien hay quan ly(0/1)?");
//		int tl=sc.nextInt();
//		employee p;
//		if(tl==0)
//		{
//			p=e;
//		}
//		else
//		{
//			p=m;
//		}
//		p.xuat();



	}

}
