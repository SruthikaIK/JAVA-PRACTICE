//if elseif else flow
/*import java.util.*;
public class day1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter date,month,year:");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        if(y>=1000&&y<=9999){
            if(m>=1&&m<=12){
                if((d>=1&&d<=31)&&(m==1||m==3||m==5||m==7||m==8||m==10||m==12)){
                    System.out.println("d,m,y valid");
                }
                else if((d>=1&&d<=30)&&(m==4||m==6||m==9||m==11)){
                    System.out.println("d,m,y valid");
                }
                else if((d>=1&&d<=28)&&m==2){
                    System.out.println("d,m,y valid");
                }
                else if(d==29&&m==2&&((y%4==0&&y%100!=0)||(y%400==0))){
                    System.out.println("d,m,y valid");
                }
                else{
                    System.out.println("invalid date");
                }
            }
            else{
                System.out.println("month invalid");
            }
        }
        else{
        System.out.println("year invalid");
        }
        sc.close();
    }
}*/

//two pointer
/*public class day1{
    public static void main(String[] args){
        int[] a={10,11,20,21,30,31,40,41};
        int l=0,r=a.length-1;
        while(l<r){
            while(l<r && a[l]%10==0){
                l++;
            }
            while(l<r&&a[r]%10!=0){
                r--;
            }
            if(l<r){
                int t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;
                r--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}*/

//product billing
class Product{
    int id;
    String name;
    double price;
    int qty;
    public Product(int i,String n,double p,int q){
        id=i;
        name=n;
        price=p;
        qty=q;
    }
    public double tot(){
        return price*qty;
    }
    public void disp(){
        System.out.println(id+" "+name+" "+price+" "+qty+" "+tot());
    }
}
public class day1{
    public static void main(String[] args){
        System.out.println("id  item  price quantity");
        Product p1=new Product(101,"Pen",10.0,5);
        Product p2=new Product(102,"Book",50.0,2);
        Product p3=new Product(103,"Bag",500.0,1);
        Product p4=new Product(104,"Bottle",150.0,3);
        Product p5=new Product(105,"Eraser",5.0,10);
        Product[] p={p1,p2,p3,p4,p5};
        double sub=0;
        int tq=0;
        Product exp=p[0],chp=p[0],hq=p[0];
        for(int i=0;i<5;i++){
            p[i].disp();
            double t=p[i].tot();
            sub+=t;
            tq+=p[i].qty;
            if(p[i].price>exp.price)exp=p[i];
            if(p[i].price<chp.price)chp=p[i];
            if(p[i].qty>hq.qty)hq=p[i];
        }
        double dis=sub*0.10;
        double amt=sub-dis;
        double gst=amt*0.18;
        double fin=amt+gst;
        System.out.println("Subtotal: "+sub);
        System.out.println("Discount: "+dis);
        System.out.println("GST: "+gst);
        System.out.println("Final Bill: "+fin);
        System.out.println("Most Expensive: "+exp.name);
        System.out.println("Cheapest: "+chp.name);
        System.out.println("Highest Qty: "+hq.name);
        System.out.println("Total Items: "+tq);
    }
}