class punjabbank {
    final private int accno;
    final private String accname;
    private String phno;
    final private String acctype;
    private float balance; 
    public punjabbank(int accno,String accname,String phno,String acctype,float balance) {
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void deposit(float amt){
        balance+=amt;
        System.out.println("Deposited.Available balance:Rs."+balance);
    }
    public void withdraw(float amt){
        if(amt<=balance){
            balance-=amt;
            System.out.println("Withdrawan.Available balance:Rs."+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void setphno(String phno){
        this.phno = phno;
    }
}
public class task7 {
    public static void main(String[] args) {
        punjabbank b1 = new punjabbank(170601, "Sita", "7869543211", "Savings", 500.0f);
        b1.deposit(250.0f);
        b1.withdraw(340.0f);

    }
}

