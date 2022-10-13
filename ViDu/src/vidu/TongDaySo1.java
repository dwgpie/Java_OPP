package vidu;

import java.util.Scanner;

public class TongDaySo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		double sum=0;
		int n;
		System.out.println("Enter number:"); n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			sum=sum+((i-1)/i);
		}
		System.out.println("Sum="+sum);
	}

}
