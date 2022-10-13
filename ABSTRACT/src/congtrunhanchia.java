
import java.util.*;

abstract class superclass{
	abstract void add();
	abstract void subtract();
	abstract void multifly();
	abstract void divide();
}
class fractions extends superclass{
	private double tu;
	private double mau;
	fractions(){
		
	}
	fractions(double tu, double mau){
		this.tu=tu;
		this.mau=mau;
	}
	public double getTu() {
		return tu;
	}
	public void setTu(double tu) {
		this.tu = tu;
	}
	public double getMau() {
		return mau;
	}
	public void setMau(double mau) {
		this.mau = mau;
	}
	void add(fractions ps) {
		double a=this.getTu()*ps.getMau()+ps.getTu()+this.getMau();
		double b=this.getMau()*ps.getMau();
		System.out.println("Ket qua cong 2 phan so: "+a+"/"+b);
	}
	
	

}
public class congtrunhanchia {
	

	public static void main(String[] args) {
		superclass ps=new fractions(16,4);
		superclass ps2=new fractions(4,8);
		System.out.println("Phan so: " + ps.tu + "/" + ps.mau);
		
	}

}
