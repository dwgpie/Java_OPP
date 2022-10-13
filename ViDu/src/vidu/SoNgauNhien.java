package vidu;

import java.util.Scanner;
import java.util.Random;
public class SoNgauNhien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=100;
//		int [] number=new int[n];
//		Random rd=new Random();
//		for(int i=0;i<n;i++)
//		{
//			number[i]=Math.abs(rd.nextInt()%10);
//			System.out.print(number[i]+" ");
//		}
//		int dem=0;
//		for(int i=0;i<number[i].len;i++)
//		{
//			for(int j=0;j<10;j++)
//			if(number[i]==j)
//			{
//				dem++;
//			}
//		}
//		System.out.print("\nSo ngau nhien tu 0 toi 9 la: "+dem);
		int[] a= new int [100];
		int[] b= new int[10];
		Random rand= new Random();
		for(int i=0;i<10;i++) {
			b[i]=0;
		}
		for(int i=0;i<100;i++) {
			a[i]= rand.nextInt(10)+0;
			System.out.println("i thu "+i+": "+a[i]);
			switch(a[i]) {
			case 0:
				b[0]++;
				break;
			case 1:
				b[1]++;
				break;
			case 2:
				b[2]++;
				break;
			case 3:
				b[3]++;
				break;
			case 4:
				b[4]++;
				break;
			case 5:
				b[5]++;
				break;
			case 6:
				b[6]++;
				break;
			case 7:
				b[7]++;
				break;
			case 8:
				b[8]++;
				break;
			case 9:
				b[9]++;
				break;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println("so lan xuat hien cua so "+i+" la: "+b[i]);
		}

	}

}
