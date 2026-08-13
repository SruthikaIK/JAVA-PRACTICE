//introduction to polymorphism
/*class shapes{
    public void area(){
        System.out.println("area of shapes ");
    }
}
class square extends shapes{
    final int a;
    public square (int a){
        this.a=a;
    }
    @Override
    public void area(){
        System.out.println("area of square "+ a*a);
    }
}
class rectangle extends shapes{
    final int c,b;
    public rectangle(int c,int b){
        this.c=c;
        this.b=b;
    }
    @Override
    public void area(){
        System.out.println("area of rectangle "+ c*b);
    }
}
class triangle extends shapes{
    final int h,x;
    public triangle(int h,int x){
        this.h=h;
        this.x=x;
    }
    @Override
    public void area(){
        System.out.println("area of triangle "+ 0.5*h*x);
    }
}
class circle extends shapes{
    final int r;
    public circle(int r){
        this.r=r;
    }
    @Override
    public void area(){
        System.out.println("area of circle "+ 3.14*r*r);
    }
}
class day3{
    public static void main(String[] args) {
        shapes sh=new shapes();
        shapes sq=new square(5);
        shapes rec=new rectangle(5,10);
        shapes tri=new triangle(3,2);
        shapes cir=new circle(6);
        sh.area();
        sq.area();
        rec.area();
        tri.area();
        cir.area();
    }
}*/

//introduction to exceptions
/*class day3{
    public static void main(String[] args) {
        int a=10,b=20,c=0;
        try{
            System.out.println(b/a);
            System.out.println(b/c);
            
        }
        catch(Exception e){
            System.out.println("impossible");
        }
        finally{
            System.out.println("executed");
        }
    }
}*/

//throw and throws
/*import java.util.*;
class day3{
    public static void main(String[] args) throws Exception{
        int b = 10000;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter withdrawal amt:");
            int w = sc.nextInt();
            if (w>b){
                throw new Exception("invalid amount");
            } 
            else{
                System.out.println("withdrawn");
            }
        } 
    }  
}*/
 
/*class division {
    void div(int a,int b) throws RuntimeException{
        System.out.println(a/b);
    }
}
public class day3 {
    public static void main(String[] args) {
        division d = new division();
        try{
            d.div(20,0);
        } 
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}*/

class pocket{
    void min(int amt) throws Exception{
        if(amt<0){
            throw new Exception("invalid amount");
        } 
        else if(amt<100){
            throw new Exception("insufficient amount");
        } 
        else{
            System.out.println("accepted");
        }
    }
}
public class day3{
    public static void main(String[] args){
        pocket pc = new pocket();
        try{
            pc.min(20);
        } 
        catch(Exception e){
            System.out.println("not accepted");
        } 
        finally{
            System.out.println("gave");
        } 
    }
}