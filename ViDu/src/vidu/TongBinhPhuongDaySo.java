package vidu;

import java.util.Scanner;

public class TongBinhPhuongDaySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		double sum=0;
		int n;
		System.out.println("Enter number:"); n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i*i;
		}
		System.out.println("Sum="+sum);
	}

}
