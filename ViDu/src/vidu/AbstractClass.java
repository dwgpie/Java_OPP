package vidu;
abstract class Bike{
	abstract void run() ;
		void changeGear() {
			System.out.println("gear changed");
		}
	
}
class Honda extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();
		
	}

}
