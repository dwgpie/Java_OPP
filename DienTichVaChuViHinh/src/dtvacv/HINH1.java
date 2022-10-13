package dtvacv;

import java.util.Scanner;

public abstract class HINH1 implements HINH{
	protected String mahinh;
	protected String tenhinh;
	HINH1(){
		
	}
	HINH1(String mahinh, String tenhinh){
		this.mahinh=mahinh;
		this.tenhinh=tenhinh;
	}
	public String getMahinh() {
		return mahinh;
	}
	public void setMahinh(String mahinh) {
		this.mahinh = mahinh;
	}
	public String getTenhinh() {
		return tenhinh;
	}
	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}
	@Override
	public String toString() {
		return "mahinh: " + mahinh + ", tenhinh: " + tenhinh ;
	}
	void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ma hinh:");mahinh=sc.nextLine();
		System.out.println("Nhap ten hinh:");tenhinh=sc.nextLine();
	}
	void in() {
		System.out.println("mahinh: " + mahinh + ", tenhinh: " + tenhinh );
	}
}
