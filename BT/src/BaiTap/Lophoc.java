package BaiTap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Sinhvien{
	private String hovaten;
	private String diachi;
	private Float diemtrungbinh;
	public String gethovaten() {
		return hovaten;
	}
	public void sethovaten(String hovaten) {
		this.hovaten=hovaten;
	}
	public String getdiachi() {
		return diachi;
	}
	public void setdiachi(String diachi){
		this.diachi=diachi;
	}
	public Float getdiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setdiemtrungbinh() {
		this.diemtrungbinh=diemtrungbinh;
	}
	public String toString() {
		return hovaten+","+diachi+","+diemtrungbinh;
	}
	void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ho va ten:"); hovaten=sc.nextLine();
		System.out.println("Nhap dia chi:"); diachi=sc.nextLine();
		System.out.println("Nhap diem trung binh:"); diemtrungbinh=sc.nextFloat();
	}
	void xuat() {
		System.out.println("Ten: "+hovaten+","+diachi+","+diemtrungbinh);
	}
	
}

public class Lophoc {
	String tenlop;
	int n;
	ArrayList <Sinhvien> L= new ArrayList<Sinhvien>();
	void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ten lop:"); tenlop=sc.nextLine();
		System.out.print("Nhap so sinh vien:"); n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap sinh vien thu "+(i+1)+" :");
			Sinhvien e= new Sinhvien();
			e.nhap();
			L.add(e);
		}
	}
	void xuat() {
		System.out.println("\nDanh sach sinh vien:");
		for(int i=0;i<n;i++)
		{
			System.out.println(L.get(i));
		}
	}
	void sxten() {
		L.sort(Comparator.comparing(Sinhvien:: gethovaten));
	}
	void timdiachi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap dia chi can tim:");
		String diachi2= sc.nextLine();
		int dem = 0;
		for(int i=0; i<L.size(); i++) {
			if(L.get(i).getdiachi().toUpperCase().compareTo(diachi2.toUpperCase()) == 0) {
				dem++;
			}
		}
		System.out.println("So nguoi co dia chi o " + diachi2 + ": " + dem);

	}
	public static void main(String[] args) {
		Lophoc m=new Lophoc();
		m.nhap();
		m.xuat();
		m.sxten();
		m.xuat();
		m.timdiachi();
	}

}
