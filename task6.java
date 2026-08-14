class newbank {
    final private int accno;
    final private String accname;
    private String phno;
    final private String acctype;
    private float balance; 
    public newbank(int accno,String accname,String phno,String acctype,float balance) {
        this.accno=accno;
        this.accname=accname;
        this.phno=phno;
        this.acctype=acctype;
        this.balance=balance;
    }
    public void setphno(String phno){
        this.phno = phno;
    }
    public String getphno(){
        return phno;
    }
}
public class task6 {
    public static void main(String[] args) {
        newbank b1 = new newbank(170601, "Sita", "2341234213", "Savings", 5020.0f);
        b1.setphno("7675543211");
        System.out.println("Phone number: " + b1.getphno());
    }
}
