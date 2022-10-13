package dtvacv;
import java.util.*;

public class DSHINH {
	
	ArrayList<HINH1> L= new ArrayList<HINH1>();
	Scanner sc = new Scanner(System.in);
	void nhap() {
		System.out.println("Nhap so luong hinh:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int chon;
			System.out.println("Hinh tron or Hinh chu nhat(0/1)");
			chon=sc.nextInt();
			if(chon==0) {
				HINHTRON tron= new HINHTRON();
				tron.nhap();
				L.add(tron);
			}
			else
			{
				HINHCHUNHAT chunhat= new HINHCHUNHAT();
				chunhat.nhap();
				L.add(chunhat);
			}
		}
	}
	void in() {
		for(int i=0;i<L.size();i++) {
			System.out.println(L.get(i));
		}
	}
	void timHinh() {
		System.out.println("Nhap ma hinh can tim: ");
		sc.nextLine();
		String tempId = sc.nextLine();
		
		for(int i=0; i< L.size(); i++) {
			if(L.get(i).getMahinh().compareTo(tempId)==0) {
				System.out.println("Hinh can tim\n" + L.get(i));
			}
		}
	}
	void xoaHinh() {
		System.out.println("Nhap ID hinh muon xoa: ");
		String tempId = sc.nextLine();
		
		for(int i=0; i<L.size(); i++) {
			if(L.get(i).getMahinh().compareTo(tempId)==0) {
				L.remove(i);
			}
		}
		System.out.println("DS Hinh sau khi xoa: ");
		in();
	}
	

	
	public static void main(String[] args) {
		
		DSHINH m= new DSHINH();
		m.nhap();
		m.in();
		m.timHinh();
		m.xoaHinh();
		
	}

}
