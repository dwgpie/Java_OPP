package vidu;

import java.util.Scanner;
public class GiaiThua {

	public static void main(String[] args) {
		// Tổng Giai thừa
		Scanner sc= new Scanner(System.in);
		int n,sum=1;
		System.out.println("Enter number:"); n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println("Sum="+sum);

	}

}
