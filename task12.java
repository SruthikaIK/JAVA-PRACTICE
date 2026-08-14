class banksys {
    final private int accno;
    final private String accname;
    private String phno;
    final private String acctype;
    private double balance; 
    public banksys(int accno,String accname,String phno,String acctype,double balance) {
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void setphno(String phno){
        this.phno = phno;
        System.out.println("\nupdated phone number:"+phno);
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
        System.out.println("\nAccount number: "+accno+"\nAccount holder name: "+accname+"\nPhone number: "+phno+"\nAccount type: "+acctype+"\nBalance: "+"Rs."+balance);
    }
}
public class task12{
    public static void main(String[] args) {
        System.out.println("Account 1");
        banksys b1 = new banksys(170601, "Sita", "7869543211", "Savings", 500.0);
        b1.disp();
        b1.deposit(5000.0d);
        b1.withdraw(3000.0d);
        b1.setphno("9999999999");
        b1.deposit(-1.0d);
        b1.withdraw(-200.0d);
        b1.withdraw(100000);

        System.out.println("\nAccount 2");
        banksys b2 = new banksys(123002, "Gita", "7654321098", "Current", 10000.0);
        b2.disp();
        b2.deposit(10000.0d);
        b2.withdraw(5000);
        b2.disp();
    }
}

