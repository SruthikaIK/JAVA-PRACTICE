class mariammanindianbank{
    int accno;
    String accname;
    String phno;
    String acctype;
    float balance;
    public mariammanindianbank(int accno,String accname,String phno,String acctype,float balance){
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void disp(){
        System.out.println("\nAccount number: "+accno+"\nAccount holder name: "+accname+"\nPhone number: "+phno+"\nAccount type: "+acctype+"\nBalance: "+"Rs."+balance);
    }
}
public class task10{
    public static void main(String[] args){
        System.out.println("=======MARIAMMAN INDIAN BANK=======");
        mariammanindianbank b1=new mariammanindianbank(170601,"Sita","2345674321","Savings",25000.0f);
        b1.disp();
    }
}

