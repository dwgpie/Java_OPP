import java.util.*;

import java.util.*;


 abstract class Person {
	protected String code;
	protected String name;
	protected int rank;
	public Person() {code = name = ""; this.rank = 0; 	} 
	
	public Person(String code, String name, int rank) {
		this.code = code;
		this.name = name;
		this.rank = rank;
	}

	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}

	public abstract String description();
	 void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		this.code = sc.nextLine();
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		System.out.println("Enter rank: ");
		this.rank = sc.nextInt();
	}
	public void display() {
		System.out.println("Person code: " + code);
		System.out.println("Person name: " + name);
		System.out.println("Rank: " + rank);
	}
}


class Professor extends Person{

	
	private String department;
	
//	public Professor(String code, String name, int rank, String department) {
//		super(code, name, rank);
//		this.department = department;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter khoa cong tac: ");
		this.department = sc.nextLine();
	
	}
	public void display() {
		super.display();
		System.out.println("khoa cong tac: " + department);
		
		
	}
    
	

	@Override
	public String description() {
		if(rank== 0) {
			return "None";
		} else if(rank==1) {
			return "Assistant Professor";
		}
		 else if(rank==2) {
				return "Associate Professor";
			}
		 else if(rank==3) {
				return "Professor ";
			}
		 else if(rank==4) {
				return "Assistant Teaching Professor";
			}
		 else if(rank==5) {
				return "Associate Teaching Professor";
		 }
		 else if(rank==6) {
				return "Teaching Professor";
		 } else {
				return null;
		}
								
	}
	
}

class Student extends Person {
	private String degreeProgram;
	private int yearGraduation;
	
//	public Student(String code, String name, int rank, String degreeProgram, int yearGradution) {
//		super(code, name, rank);
//		this.degreeProgram = degreeProgram;
//		this.yearGraduation = yearGradution;
//	}
//	
//	public String getDegreeProgram() {
//		return degreeProgram;
//	}
//	public void setDegreeProgram(String degreeProgram) {
//		this.degreeProgram = degreeProgram;
//	}
//	public int getYearGraduation() {
//		return yearGraduation;
//	}
//	public void setYearGraduation(int yearGraduation) {
//		this.yearGraduation = yearGraduation;
//	}
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chuong trinh: ");
		this.degreeProgram = sc.nextLine();
		System.out.println("Enter nam tot nghiep: ");
		this.yearGraduation = sc.nextInt();
	
	}
	public void display() {
		super.display();
		System.out.println("chuong trinh hoc: " + degreeProgram);
		System.out.println("nam tot nghiep: " + yearGraduation);
		
	}

	@Override
	public String description() {
		if(rank == 0) {
			return "None";
		} else if(rank == 1) {
			return "Freshman";
		} else if(rank == 2) {
			return "Sophomore";
		} else if(rank == 3) {
			return "Junior";
		} else if(rank == 4) {
			return "Senior";
		} else if(rank == 5) {
			return "Graduate";
		} else if(rank == 6) {
			return "Masters Postgraduate";
		} else if(rank == 7) {
			return "PhD Postgraduate";
		} else {
			return null;
		}
	}
	
	
}

public class Bai3 {
	int n;
	Person []a;
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguoi:");
		n=sc.nextInt();
		a=new Person[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap nguoi thu "+(i+1)+":");
			System.out.println("SInh vien hay Giao su(0/1)?");
			int tl=sc.nextInt();
			if(tl==0)
			{
				a[i]=new Student();
			}
			else {
				a[i]=new Professor();
			}
			a[i].nhap();
		}
	}
	void in() {
		for(Person x:a) {
			x.display();
		}
	}
	public void display() {
		
	}
	public static void main(String[] args) {
		Bai3 m=new Bai3();
		m.nhap();
		m.in();
		System.out.println("XOng!!");
	}

}


