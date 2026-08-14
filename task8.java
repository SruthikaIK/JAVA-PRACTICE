import java.util.*;
class nationalbank {
    final private int accno;
    final private String accname;
    private String phno;
    final private String acctype;
    private double balance; 
    public nationalbank(int accno,String accname,String phno,String acctype,double balance) {
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void deposit(double amt){
        System.out.println("initial balance:Rs."+balance);
        System.out.println("deposit:Rs."+amt);
        if(amt>0){
            balance+=amt;
            System.out.println("new balance:Rs."+balance);
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
}
public class task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        nationalbank b1 = new nationalbank(170601, "Sita", "2987654563", "Savings", 5000.0d);
        System.out.println("Enter deposit amount:");
        double a=sc.nextDouble();
        b1.deposit(a);
    }
}

