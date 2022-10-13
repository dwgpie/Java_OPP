package tiendien;

import java.util.Scanner;

interface ITIENDIEN {
    public double TinhThanhTien();
}
abstract class KHACHHANG implements ITIENDIEN {
    protected String cusCode;
    protected String cusName;
    protected String dateTime;
    protected int amountKW;
    protected double unitPrice, price;
    
    public KHACHHANG() {}
    public KHACHHANG(String cusCode, String cusName, String dateTime, int amountKW, double unitPrice, double price) {
        this.cusCode = cusCode;
        this.cusName = cusName;
        this.dateTime = dateTime;
        this.amountKW = amountKW;
        this.unitPrice = unitPrice;
        this.price = price;
    }
    
    public String getCusCode() {
        return cusCode;
    }
    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }
    public String getCusName() {
        return cusName;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public int getAmountKW() {
        return amountKW;
    }
    public void setAmountKW(int amountKW) {
        this.amountKW = amountKW;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Code: ");
        this.cusCode = sc.nextLine();
        System.out.println("Enter Customer Name: ");
        this.cusName = sc.nextLine();
        System.out.println("Enter Time: ");
        this.dateTime = sc.nextLine();
        System.out.println("Enter Amount: ");
        this.amountKW = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Unit Price: ");
        this.unitPrice = Float.parseFloat(sc.nextLine());
    }
    public double TinhThanhTien() {
        return price;
    }
    @Override
    public String toString() {
        return "KHACHHANG ["
                + "cusCode=" + cusCode +
                ", cusName=" + cusName +
                ", dateTime=" + dateTime +
                ", amountKW=" + amountKW +
                ", price=" + price +
                ", unitPrice=" + unitPrice +
                "]";
    }
}
class KHACHHANGVIETNAM extends KHACHHANG {
    private int cusObject;
    private int quotaKW;
    
    public KHACHHANGVIETNAM() {}
    public KHACHHANGVIETNAM(String cusCode, String cusName, String dateTime, int amountKW, double unitPrice, double price, int cusObject, int quotaKW) {
        super(cusCode, cusName, dateTime, amountKW, unitPrice, price);
        this.cusObject = cusObject;
        this.quotaKW = quotaKW;
    }
    public int getCusObject() {
        return cusObject;
    }
    public int getQuotaKW() {
        return quotaKW;
    }
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Loai khach hang: (1. Sinh hoat. 2. Kinh doanh. 3. San xuat)");
        this.cusObject = sc.nextInt();
        System.out.println("Enter Quota: ");
        this.quotaKW = sc.nextInt();
    }
    public double TinhThanhTien() {
        if(amountKW <= quotaKW) {
            return  this.amountKW * this.unitPrice;
        } else {
            return this.amountKW*this.unitPrice*this.quotaKW + (this.amountKW - this.quotaKW)*this.unitPrice*2.5;
        }
    }
    @Override
    public String toString() {
        String temp;
        if(cusObject == 1) {
            temp = "Sinh hoat";
        } else if(cusObject == 2) {
            temp = "Kinh doanh";
        } else {
            temp = "San xuat";
        }
        return "KHACHHANGVIETNAM ["
                + super.toString()
                + "cusObject=" + temp
                + ", quotaKW=" + quotaKW
                + "]";
    }
    
}
class KHACHHANGNUOCNGOAI extends KHACHHANG {
    private String national;
    
    public KHACHHANGNUOCNGOAI() {}
    public KHACHHANGNUOCNGOAI(String cusCode, String cusName, String dateTime, int amountKW, float unitPrice, double price, String national) {
        super(cusCode, cusName, dateTime, amountKW, unitPrice, price);
        this.national = national;
    }
    public String getNational() {
        return national;
    }
    
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter National: ");
        this.national = sc.nextLine();
    }
    public double TinhThanhTien() {
        return this.amountKW * this.unitPrice;
    }
    @Override
    public String toString() {
        return "KHACHHANGNUOCNGOAI [" + super.toString() + "national=" + national + "]";
    }
}
public class DSKHACHHANG {
    
    private KHACHHANG[] kh;
    private int n;
    Scanner sc = new Scanner(System.in);
    
    public DSKHACHHANG() {
        System.out.println("Nhap so luong khach hang: ");
        n = sc.nextInt();
        kh = new KHACHHANG[n];
        
        for(int i=0; i<n; i++) {
            kh[i] = new KHACHHANG(){};
        }
    }
    
    public void nhapKH() {
        int choose;
        System.out.println("KHVN or KHNN (1/2)?");
        choose = sc.nextInt();
        for(int i=0; i<n; i++) {
            if(choose == 1) {
                kh[i] = new KHACHHANGVIETNAM();
                kh[i].input();
                kh[i].price = kh[i].TinhThanhTien();
            } else if(choose == 2) {
                kh[i] = new KHACHHANGNUOCNGOAI();
                kh[i].input();
                kh[i].price = kh[i].TinhThanhTien();
            } else {
                System.out.println("Lua chon khong hop le!!");
            }
        }
    }
    public void hienthiKH() {
        for(int i=0; i<n; i++) {
            System.out.println(kh[i].toString());
        }
    }
    public void timKH() {
        String tempCode;
        System.out.println("Nhap ma KH can tim: ");
        sc.nextLine();
        tempCode = sc.nextLine();
        int temp = 0;
        
        for(KHACHHANG k:kh) {
            if(k.getCusCode().compareTo(tempCode) == 0) {
                temp = 1;
                break;
            }
        }
        
        if(temp == 1) {
            for(int i=0; i<n; i++) {
                if(kh[i].getCusCode().compareTo(tempCode) == 0) {
                    System.out.println(kh[i].toString());
                }
            }
        } else {
            System.out.println("Khong tim thay khach hang!!");
        }
    }
    
    public void capnhatTen() {
        String name;
        System.out.println("Nhap ten muon cap nhat: ");
        name = sc.nextLine();
        int temp = 0, k = -1;
        
        for(int i=0; i<n; i++) {
            if(kh[i].getCusName().toUpperCase().compareTo(name.toUpperCase()) == 0) {
                temp  = 1;
                k = i;
                break;
            }
        }
        if(temp == 1) {
            String newName;
            System.out.println("Nhap ten moi: "); newName = sc.nextLine();
            kh[k].setCusName(newName);
            System.out.println("Thong tin moi: " +kh[k].toString());
        } else {
            System.out.println("Khong tim thay khach hang!!");
        }
    }
    public void sort() {
        for(int i =0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                if(kh[i].TinhThanhTien() >= kh[j].TinhThanhTien()) {
                    KHACHHANG temp;
                    temp = kh[i];
                    kh[i] = kh[j];
                    kh[j] = temp;
                }
            }
        }
        System.out.println("\nDS Khach hang sau khi sap xep theo thanh toan");
        hienthiKH();
    }
    public static void main(String[] args) {
        DSKHACHHANG ds = new DSKHACHHANG();
        ds.nhapKH();
        ds.hienthiKH();
        ds.timKH();
        ds.capnhatTen();
        ds.sort();
    }

}