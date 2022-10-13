package ptb1;

import java.util.Scanner;

public class PTB1 {
	double hsb1,hsb0;
	PTB1(){}
	PTB1(double a,double b){
		hsb1=a;
		hsb0=b;
	}
	void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Nhap he so bac 1:");hsb1=sc.nextDouble();
		System.out.println(" Nhap he so bac 0:");hsb0=sc.nextDouble();
	}
	void giai() {
		System.out.println("\n Giai phuong trinh: "+hsb1+".x + "+hsb0+" = 0");
		if(hsb1==0) {
			if(hsb0==0) {
				System.out.println("\n Pt vo so nghiem");
			}
			else
			{
				System.out.println("\n Pt vo nghiem");
			}
		}
		else
		{
			System.out.println("\n PT co nghiem x= "+ (-hsb0/hsb1));
		}
			
	}

	public static void main(String[] args) {
		PTB1 m =new PTB1();
		PTB1 pt1=new PTB1(3,9.6);
		m.nhap();
		m.giai();
		pt1.giai();
	}

}
