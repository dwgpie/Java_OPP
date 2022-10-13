
import java.util.Scanner;
class NV{
	String name;
	double hsl;
	NV(){}
	NV(String n, double h)
	{
		name=n;
		hsl=h;
	}
	void nhap() {
		
	}
	void xuat() {
		System.out.println("\nTen: "+ name+" HSL= "+hsl);
	}	
}
class QL extends NV{
	String cv;
	double phucap;
	QL(){}
	QL(String n, double h, String cv1, double pc){
		super(n,h);
		cv=cv1;
		phucap=pc;
	}
	void nhap() {}
	void xuat() {
		super.xuat();
		System.out.println("\t Chuc vu: "+cv+" phu cap= "+phucap);
	}
}
public class Test_PTA {
	
	
	
	public static void main(String[] args) {
		NV a=new NV("Ha Lan",4.5);
		QL b= new QL("Min", 6.23,"Truong phong", 3000);
		System.out.println("\n Nhan vien va Quan ly");
		a.xuat();
		b.xuat();
		System.out.println("Ban muon in nhan vien hay quan ly(0/1)?");
		Scanner sc=new Scanner(System.in);
		int tl=sc.nextInt();
		NV p;
		if(tl==0)
		{
			p=a;
		}
		else
		{
			p=b;
		}
		p.xuat();
	}

}
