interface printable{
	void print();
}
interface showtable{
	void show();
}
class A implements printable, showtable{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
}
public class B1 {

	public static void main(String[] args) {
		A obj=new A();
		printable p=new A();
		p.print();
		obj.print();
		obj.show();
	}

}
