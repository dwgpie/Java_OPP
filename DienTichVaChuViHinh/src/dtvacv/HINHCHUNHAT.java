package dtvacv;

import java.util.Scanner;

public class HINHCHUNHAT extends HINH1 implements HINH {
	
	private double chieudai;
	private double chieurong;
	HINHCHUNHAT(){
		
	}
	HINHCHUNHAT(double chieudai, double chieurong){
		this.chieudai=chieudai;
		this.chieurong=chieurong;
	}
	
	@Override
	public double dientich() {
		return (chieudai*chieurong);
//		System.out.println("Dien tich hinh chu nhat:"+ (chieudai*chieurong));
	}

	@Override
	public double chuvi() {
		return (chieudai+chieurong)*2;
//		System.out.println("Chu vi hinh chu nhat:"+ ((chieudai+chieurong)*2));
	}
	void nhap() {
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap chieu dai:"); chieudai=sc.nextDouble();
		System.out.println("Nhap chieu rong:"); chieurong=sc.nextDouble();

	}
	void in() {
		super.in();
		System.out.println("Dien tich hinh chu nhat:"+ dientich());
		System.out.println("Chu vi hinh chu nhat:"+ chuvi());
	}
	@Override
	public String toString() {
		return "HINHCHUNHAT [chieudai=" + chieudai + ", chieurong=" + chieurong +", Chu vi:"+chuvi()+ ", Dien tich:"+dientich()+ "]";
	}
	
}
