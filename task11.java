class bankmi{
    static String bankname="Mariamman Indian Bank";
    private int accno;
    private String accname;
    private String phno;
    private String acctype;
    private float balance;
    public bankmi(int accno,String accname,String phno,String acctype,float balance){
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
public class task11{
    public static void main(String[] args){
        System.out.println("\nAccount 1:");
        bankmi b1=new bankmi(170601,"Sita","2987654563","Savings",5000.0f);
        b1.disp();
        System.out.println("\nAccount 2:");
        bankmi b2=new bankmi(123002,"Gita","7651234321","Current",10500.0f);
        b2.disp();
    }   
}

