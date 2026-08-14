class bank{
    static String bankname="Mariamman Indian Bank";
    int accno;
    String accname;
    long phno;
    String acctype;
    float balance;
    public bank(int accno,String accname,long phno,String acctype,float balance){
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void disp(){
        System.out.println("Bank Name: "+bankname+"\nAccount number: "+accno+"\nAccount holder name: "+accname+"\nPhone number: "+phno+"\nAccount type: "+acctype+"\nBalance: "+"Rs."+balance);
    }
}
public class task2 {
    public static void main(String[] args){
        System.out.println("Customer 1:");
        bank b1=new bank(170601,"Sita",2987654563l,"Savings",5020.0f);
        b1.disp();
        System.out.println("Customer 2:");
        bank b2=new bank(123002,"Gita",7651234321l,"Current",10500.0f);
        b2.disp();
    }
    
}
