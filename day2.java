//introduction to abstraction and interface and inheritance
/*abstract class bank{
    public abstract void pin();
}
class desk extends bank{
    @Override
    public void pin(){
        System.out.println("12345");
    }
}
interface server{
    public void password();
}
class phone implements server{
    @Override
    public void password(){
        System.out.println("6789");
    }
}
public class day2{
    public static void main(String[] args){
        desk obj=new desk();
        obj.pin();
        phone myobj=new phone();
        myobj.password();
    }
}*/

//TASK 1 VECHILE RENTAL
import java.util.*;
interface Insurable{
    double getInsCost(int days);
}

abstract class Vehicle{
    final private String id;
    final private String brand;
    final private double rate;
    public Vehicle(String id, String brand, double rate){
        this.id=id;
        this.brand=brand;
        this.rate=rate;
    }
    public String getId(){ 
        return id;
    }
    public String getBrand(){
        return brand; 
    }
    public double getRate(){ 
        return rate; 
    }
    public abstract double getCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String id,String brand,double rate){
        super(id,brand,rate);
    }
    @Override
    public double getCost(int days){
        return (getRate()*days) + (15*days);
    }
    @Override
    public double getInsCost(int days){
        return 20.0*days;
    }
}

class Bike extends Vehicle{
    public Bike(String id,String brand,double rate){
        super(id,brand,rate);
    }
    @Override
    public double getCost(int days){
        double total = getRate()*days;
        if (days>3) total*=0.9;
        return total;
    }
}

class Truck extends Vehicle implements Insurable{
    public Truck(String id,String brand,double rate){
        super(id,brand,rate);
    }
    @Override
    public double getCost(int days){
        return (getRate()*days) + 50.0;
    }
    @Override
    public double getInsCost(int days){
        return 40.0*days;
    }
}

class Agency{
    final private List<Vehicle> list = new ArrayList<>();
    public void add(Vehicle v){
        list.add(v);
    }
    public void bill(String id,int days){
        Vehicle v=null;
        for (Vehicle item : list){
            if (item.getId().equalsIgnoreCase(id)){
                v=item;
                break;
            }
        }
        if (v==null) {
            System.out.println("Not found");
            return;
        }
        double base = v.getCost(days);
        double ins = 0;
        if (v instanceof Insurable i){
            ins = i.getInsCost(days);
        }
        System.out.println("Vehicle: "+v.getId()+v.getBrand());
        System.out.println("Base cost: "+base);
        System.out.println("Insurance: "+ins);
        System.out.println("Total: " +(base + ins));
        System.out.println();
    }
}

public class day2{
    public static void main(String[] args){
        Agency a = new Agency();
        a.add(new Car("C101", "Honda", 50));
        a.add(new Bike("B202", "Yamaha", 20));
        a.add(new Truck("T303", "Volvo", 100));

        a.bill("C101", 3);
        a.bill("B202", 5);
        a.bill("T303", 2);
    }
}

