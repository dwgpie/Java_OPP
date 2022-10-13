package vidu;

import java.util.Scanner;
import java.lang.Math;


public class TongDaySo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		double sum=1;
		int n;
		System.out.println("Enter number:"); n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+Math.pow(2,(2*i+1));
		}
		System.out.println("Sum="+sum);
	}

}
