//customise exception
/*import java.util.*;
class lowbalanceException extends Exception{
    public lowbalanceException(String er){
        super(er);
    }
}
class bank{
    static void withdraw(int amt) throws Exception{
        if(amt>10000){
            throw new lowbalanceException("low balance");
        }
        else{
            System.out.println("withdrawn");
        }
    }
}
public class day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
            bank.withdraw(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();  
        }
    }
}*/

//custom exception
/*import java.util.*;
class invalidmarksException extends Exception{
    public invalidmarksException(String er){
        super(er);
    }
}
class insufficientmarksException extends Exception{
    public insufficientmarksException(String er){
        super(er);
    }
}
class stumarks{
    int marks(int m,int total) throws Exception{
        if(m<0 || m>100){
            throw new invalidmarksException("invalid marks");
        } 
        else if(m<35){
            throw new insufficientmarksException("insufficient marks");
        } 
        else{
            total+=m;
        }
        return total;
    }
}
public class day4{
    public static void main(String[] args){
        int tot=0;
        stumarks sm = new stumarks();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter marks:");
            int m = sc.nextInt();
            try{
                tot = sm.marks(m,tot);
            } 
            catch(Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
        System.out.println("total marks:"+tot);
        sc.close();
    }
}*/

//custom exception
/*import java.util.*;
class invalidpasswordException extends Exception{
    public invalidpasswordException(String er){
        super(er);
    }
}
class password{
    void check(String pass) throws Exception{
        if(pass.length()<8){
            throw new invalidpasswordException("invalid password");
        } 
        else if(!pass.matches(".*[A-Z].*")){
            throw new invalidpasswordException("invalid password");
        } 
        else if(!pass.matches(".*[a-z].*")){
            throw new invalidpasswordException("invalid password");
        } 
        else if(!pass.matches(".*[0-9].*")){
            throw new invalidpasswordException("invalid password");
        } 
        else if(!pass.matches(".*[@#$%&].*")){
            throw new invalidpasswordException("invalid password");
        }
        else{
            System.out.println("valid password");
        }
    }
}
public class day4{
    public static void main(String[] args){
        password p = new password();
        Scanner sc= new Scanner(System.in);
        System.out.print("enter password:");
        String pass = sc.nextLine();
        try{
            p.check(pass);
        } 
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
        finally{
            sc.close();
        }
    }
}*/

//ArrayList-add,get,set,remove,clear,size,sort
/*import java.util.*;
public class day4{
    public static void main(String[] args){
        List<Integer> al=new ArrayList<>(5);
        System.out.println(al.size());
        al.add(10);
        al.add(20);
        al.remove(1);
        System.out.println(al.get(0));
        al.add(30);
        al.set(0,40);
        al.add(0,50);
        System.out.println(al.size());
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        al.clear();
        System.out.println(al);
    }
}*/

//sorting an arraylist using bubble sort
/*import java.util.*;
public class day4{
    public static void swap(ArrayList<Integer> al,int i,int j){
        int temp=al.get(i);
        al.set(i,al.get(j));
        al.set(j,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter number:");
            al.add(sc.nextInt());
        }
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.size()-1-i;j++){
                if(al.get(j)>al.get(j+1)){
                    swap(al,j,j+1);
                }
            }
        }
        System.out.println("sorted array:"+al);
        sc.close();
    }
}*/

//segregating in ArrayList using two pointer
/*import java.util.*;
public class day4{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<8;i++){
            System.out.print("enter number:");
            al.add(sc.nextInt());
        }
        int c=0;
        int s;
        for(s=0;s<al.size();s++){
            if(al.get(s)%2!=0){
                int temp=al.get(c);
                al.set(c,al.get(s));
                al.set(s,temp);
                c++;
            }
        }
        System.out.println("sorted array:"+al);
        sc.close();
    }
}*/

//LinkedList
import java.util.*;
public class day4{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter number:");
            ll.add(sc.nextInt());
        }
        System.out.println("linked list:"+ll);
        ll.addFirst(10);
        ll.addLast(20);
        ll.removeFirst();
        ll.removeLast();
        ll.set(0,10);
        ll.get(2);
        sc.close();
    }
}




