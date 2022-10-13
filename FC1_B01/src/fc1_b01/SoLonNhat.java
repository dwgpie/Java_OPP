package fc1_b01;

import java.util.Scanner;

public class SoLonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NHẬP 3 SỐ, TÌM SỐ LỚN NHẤT
		double a,b,c;
		System.out.println("Enter a,b,c:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if(a>b && a>c)
		{
			System.out.print("Max numeber is:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.print("Max numeber is:"+b);
		}
		else
		{
			System.out.print("Max numeber is:"+c);
		}
		
	}

}
