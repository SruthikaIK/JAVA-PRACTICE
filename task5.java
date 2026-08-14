class axisbank{
    final private int accno;
    final private String accname;
    final private long phno;
    final private String acctype;
    final private float balance;
    public axisbank(int accno,String accname,long phno,String acctype,float balance){
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void getaccno(){
        System.out.println("Account number:"+accno);
    }
    public void getaccname(){
        System.out.println("Account holder name:"+accname);
    }
    public void getphno(){
        System.out.println("Phone number:"+phno);
    }
    public void getacctype(){
        System.out.println("Account type:"+acctype);
    }
    public void getbalance(){
        System.out.println("Balance:Rs."+balance);
    }
}
public class task5 {
    public static void main(String[] args) {
        axisbank b1 = new axisbank(170601, "Sita", 2987654563l, "Savings", 5020.0f);
        b1.getaccno();
        b1.getaccname();
        b1.getphno();   
        b1.getacctype();
        b1.getbalance();
    }
}
