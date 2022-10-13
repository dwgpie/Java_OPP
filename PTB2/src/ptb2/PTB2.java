package ptb2;

import java.util.Scanner;


class PTB1{
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
		
		double gethsb1() {
			return hsb1;
		}
		double gethsb0() {
			return hsb0;
		}
}

public class PTB2 extends PTB1{
	double hsb2;
	void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println(" Nhap he so bac 2:"); hsb2=sc.nextDouble();	
		super.nhap();
	}
	PTB2(){}
	PTB2(double a,double b,double c){ //ax^2 + bx + c=0
		super(b,c);//Phai goi truoc
		hsb2=a;
	}
	void giai() {
		if(hsb2==0)
		{
			System.out.println("\n Day la pt bac 1: \n");	super.giai();

		}
		else
		{
			System.out.println("\n Giai pt bac 2");
			double d= gethsb1() * gethsb1() - 4 * hsb2 * gethsb0();
			if(d<0)
			{
				System.out.println("PT vo nghiem");
			}
			else if(d==0)
			{
				System.out.println("PT co nghiem kep x1=x2="+(-gethsb1()/2*hsb2));
			}
			else
			{
				double x1=(-gethsb1()+Math.sqrt(d))/(2*hsb2);
				double x2=(-gethsb1()-Math.sqrt(d))/(2*hsb2);
				System.out.println("PT co nghiem x1="+x1);
				System.out.println("PT co nghiem x2="+x2);
			}
		}
	}

	public static void main(String[] args) {
		PTB2 m=new PTB2();
		PTB2 ptb2=new PTB2(-5,6,2);
//		m.nhap();
//		m.giai();
		ptb2.giai();
		
		

	}

}
