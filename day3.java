//polymorphism
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

/*bank example
class banks{
    public int deposit(int amt){
        return amt;
    }
    public String deposit(int amt,String des){
        return des;
    }
}
class savings extends banks{
    public int calcs(){
        
    }
}*/

//exceptions
class day3{
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
}
