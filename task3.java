class mibank{
    static String bankname="Mariamman Indian Bank";
    final private int accno;
    final private String accname;
    private long phno;
    final private String acctype;
    private float balance;
    public mibank(int accno,String accname,long phno,String acctype,float balance){
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
    public long getphno(){
        return phno;
    }
    public String getacctype(){
        return acctype;
    }
    public float getbalance(){
        return balance;
    }
    public void setphno(long phno){
        this.phno=phno;
    }
    public void setbalance(float balance){
        if(balance>=0){
            this.balance=balance;
        }
        else{
            System.out.println("minimum balance required is 0");
        }
    }
    public void disp(){
        System.out.println("Bank Name: "+bankname+"\nAccount number: "+accno+"\nAccount holder name: "+accname+"\nPhone number: "+phno+"\nAccount type: "+acctype+"\nBalance: "+"Rs."+balance);
    }
}
public class task3 {
    public static void main(String[] args){
        System.out.println("Customer 1:");
        mibank b1=new mibank(170601,"Sita",5432134710l,"Savings",5020.0f);
        b1.disp();
        System.out.println("Customer 2:");
        mibank b2=new mibank(123002,"Gita",6785410109l,"Current",10500.0f);
        b2.disp();
        b1.setphno(9876543211l);
        b2.setbalance(6000.0f);
        b1.disp();
        b2.disp();
        System.out.println("Customer 1 name: " + b1.getaccname());
        System.out.println("Customer 2 account type: " + b2.getacctype());
    }
}

