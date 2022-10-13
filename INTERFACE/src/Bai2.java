import java.util.*;


class Bill {
	
	private String customercode;
	private String customertype;
	private double oldindex;
	private double newindex;
	
	
	public String getCustomercode() {
		return customercode;
	}


	public void setCustomercode(String customercode) {
		this.customercode = customercode;
	}


	public String getCustomertype() {
		return customertype;
	}


	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}


	
	

	
	
	@Override
	public String toString() {
		return "Ma KH: "+  customercode + ", loai KH: " + customertype + ", so cu: " + oldindex
				+ ", so moi: " + newindex;
	}


	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma Khach hang: "); customercode=sc.nextLine();
		System.out.println("Nhap loai Khach hang: "); customertype=sc.nextLine();
		System.out.println("Nhap chi so cu: "); oldindex=sc.nextDouble();
		System.out.println("Nhap chi so moi "); newindex=sc.nextDouble();
	}
	
	public int price() {
		if(this.customertype.equals("Resident")) {
			return 500;
		} else if(this.customertype.equals("Business") || this.customertype.equals("Organization")) {
			return 400;
		} else {
			return 300;
		}
	}
	
	void output() {
		System.out.println("Ma KH: "+  customercode + ", loai KH: " + customertype + ", so cu: " + oldindex
				+ ", so moi: " + newindex );
	}
	
	public double payment() {
		return price()*(oldindex-newindex);
	}
	
	
}


public class Bai2 {

	
	public static void main(String[] args) {
		Bill a= new Bill();
		a.input();
		a.output();
		
		System.out.println("Thanh toan: "+a.payment());
		
	}

}
