package vidu;

import java.util.Scanner;
public class TongCacChuSoTrong1So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n,tong=0;
		System.out.print("Nhap n:");
		n=sc.nextInt();
		do {
			int sd=n%10;
			n=n/10;
			tong=tong+sd;
		}
		while(n>0);
		System.out.print("Tong="+tong);
	}

}
