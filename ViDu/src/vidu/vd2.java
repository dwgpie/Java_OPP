package vidu;

import java.util.Scanner;

public class vd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=1,tong=0;
		while(n!=0)
		{
			System.out.print("Enter number:");
			n=sc.nextInt();
			tong=tong+n;
		}
		System.out.print("Total:"+tong);
		

	}

}
