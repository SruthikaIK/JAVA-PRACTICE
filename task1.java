class bankacc{
    static String bankname="Mariamman Indian Bank";
    int accno;
    String accname;
    public bankacc(int accno,String accname){
        this.accno=accno;
        this.accname=accname;
    }
    public void disp(){
        System.out.println("Bank Name: "+bankname+"\nAccount number: "+accno+"\nAccount holder name: "+accname);
    }
}
public class task1{
    public static void main(String[] args){
        bankacc b1=new bankacc(170601,"Sita");
        b1.disp();
        bankacc b2=new bankacc(123002,"Gita");
        b2.disp();
    }
}


