class MariammanIndianbank{
    static String bankname="Mariamman Indian Bank";
    final private int accno;
    final private String accname;
    private String phno;
    final private String acctype;
    private double balance;
    public MariammanIndianbank(int accno,String accname,String phno,String acctype,double balance){
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public int getaccno(){
        return accno;
    }
    public String getaccname(){
        return accname;
    }
    public String getphno(){
        return phno;
    }
    public String getacctype(){
        return acctype;
    }
    public double getbalance(){
        return balance;
    }
    public void setphno(String phno){
        this.phno=phno;
        System.out.println("Phone number updated");
    }
    public void deposit(double amt){
        if(amt>0){
            System.out.println("\ninitial balance:Rs."+balance);
            System.out.println("deposit:Rs."+amt);
            balance+=amt;
            System.out.println("new balance:Rs."+balance);
        }
        else{
            System.out.println("\ninvalid deposit amount");
        }
    }
    public void withdraw(double amt){
        if(amt<=0){
            System.out.println("\ninvalid withdraw amount");
        }
        else if(amt<=balance){
            System.out.println("\ninitial balance:Rs."+balance);
            System.out.println("withdraw:Rs."+amt);
            balance-=amt;
            System.out.println("new balance:Rs."+balance);
        }
        else{
            System.out.println("\nInsufficient balance");
        }
    }
    public void disp(){
        System.out.println("\nAccount details:");
        System.out.println("\nBank name: "+bankname+"\nAccount number: "+accno+"\nAccount holder name: "+accname+"\nPhone number: "+phno+"\nAccount type: "+acctype+"\nBalance: "+"Rs."+balance);
    }
}
public class task_13{
    public static void main(String[] args) {
        System.out.println("Account 1");
        MariammanIndianbank b1 = new MariammanIndianbank(170601, "Sita", "7869543211", "Savings", 5000.0);
        b1.disp();
        b1.deposit(5000.0d);
        b1.withdraw(3000.0d);
        b1.setphno("9999999999");
        System.out.println("Account Number:"+b1.getaccno());
        System.out.println("Account Name:"+b1.getaccname());
        System.out.println("Phone Number:"+b1.getphno());
        System.out.println("Account Type:"+b1.getacctype());
        System.out.println("Balance:"+b1.getbalance());
    }  
}


