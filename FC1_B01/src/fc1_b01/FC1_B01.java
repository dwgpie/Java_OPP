package fc1_b01;

import java.util.Scanner;

public class FC1_B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Xin chao cac ban!!!\n Moi ban nhap tuoi?");
//		int tuoi;
		Scanner kb= new Scanner(System.in); 
//		tuoi=kb.nextInt();
//		System.out.println("Ban duoc"+ tuoi);
		
		int a,b,tong,hieu,tich;
		double thuong;
		System.out.print("Nhap a:\n");
		a=kb.nextInt();
		System.out.print("Nhap b:\n");
		b=kb.nextInt();
		tong=a+b;
		hieu=a-b;
		tich=a*b;
		thuong=(double)a/b;
		System.out.println("Tong= "+tong);
		System.out.println("Hieu= "+hieu);
		System.out.println("Tich= "+tich);
		System.out.format("Thuong= %10.4f",thuong);
		
	}

}
