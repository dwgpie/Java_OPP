import java.util.Scanner;

class Employee implements Comparable{
	private String ten;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}


	public String toString() {
		
		return "Ten: "+ ten+", tuoi: "+age;
	}
	void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ten: ");ten=sc.nextLine();
		System.out.println("Nhap tuoi: ");age=sc.nextInt();
		
	}
	void xuat() {
		System.out.println("Ten: "+ ten+", tuoi: "+age);
	}

	
	public int compareTo(Employee p) {
		if(age>p.age) return 1;
		else if(age<p.age) return -1;
		else return 0;
	}

	@Override
	public int compareTo(Object o) {
		return compareTo(o);
	}
	
}
public class Bai1 {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.nhap();
		e.xuat();
		Employee p=new Employee();
		p.nhap();
		p.xuat();
		if(e.compareTo(p)>1) {
			System.out.println("e lon tuoi hon p");
		}
		else if(e.compareTo(p)==0) {
			System.out.println("e bang tuoi p");
		}
		else
		{
			System.out.println("e nho tuoi hon p");
		}
	}

}
