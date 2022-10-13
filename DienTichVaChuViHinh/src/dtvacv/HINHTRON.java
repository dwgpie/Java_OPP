package dtvacv;

import java.util.*;
public class HINHTRON extends HINH1 implements HINH {
	
	private double PI=Math.PI;
	private double bankinh;
	HINHTRON(){
		
	}
	HINHTRON(double PI, double bankinh){
		this.PI=PI;
		this.bankinh=bankinh;
	}
	
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	@Override
	public double dientich() {
		return (bankinh*bankinh*PI);
//		System.out.println("Dien tich hinh tron:"+ (bankinh*bankinh*PI));
	}

	@Override
	public double chuvi() {
		return (2*bankinh*PI);
//		System.out.println("Chu vi hinh tron:"+ (2*bankinh*PI));
	}
	void nhap() {
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ban kinh:"); bankinh=sc.nextDouble();
	}
	
	
	void in() {
		super.in();
		System.out.println("Dien tich hinh tron:"+dientich());
		System.out.println("Chu vi hinh tron:"+ chuvi());
	}
	@Override
	public String toString() {
		return "HINHTRON [PI=" + PI + ", bankinh=" + bankinh + ", Chu vi:"+chuvi()+ ", Dien tich:"+dientich()+"]";
	}
	
	
	
}
