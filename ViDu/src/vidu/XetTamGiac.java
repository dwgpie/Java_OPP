package vidu;

import java.util.Scanner;

public class XetTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhập 3 cạnh của tam giác. Xét tam giác cân, vuông, đều, thường
		
		Scanner sc= new Scanner(System.in);
		double a,b,c;
		System.out.print("Nhap a,b,c:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		if((a==b || a==c || b==c) )
		{
			System.out.print("Tam giac can");
		}
		else if(a*a==b*b+c*c || b*b==c*c+a*a || c*c==a*a+b*b )
		{
			System.out.print("Tam giac vuong");
		}
		else
		{
			System.out.print("Tam giac thuong");
		}
		
	}

}
