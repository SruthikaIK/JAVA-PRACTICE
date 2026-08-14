class mbank {
    final private int accno;
    final private String accname;
    private String phno;
    final private String acctype;
    private double balance; 
    public mbank(int accno,String accname,String phno,String acctype,double balance) {
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void withdraw(double amt){
        if(amt<=0){
            System.out.println("invalid withdraw amount");
        }
        else if(amt<=balance){
            System.out.println("initial balance:Rs."+balance);
            System.out.println("withdraw:Rs."+amt);
            balance-=amt;
            System.out.println("new balance:Rs."+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class task9{
    public static void main(String[] args){
        mbank b1 = new mbank(170601, "Sita", "4563214532", "Savings", 7500.0d);
        b1.withdraw(340.0d);
    }
}

