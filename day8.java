//priority queue
/*import java.util.*;
class panel{
    String name;
    int num;
    int can;
    panel(String name,int num,int can) {
        this.name=name;
        this.num=num;
        this.can=can;
    }
    public void disp(){
        System.out.println(name);
    }
}
public class day8 {
    public static void main(String[] args) {
        PriorityQueue<panel> q= new PriorityQueue<>(
            (a,b) -> a.can - b.can
        );
        panel p1=new panel("abc",1,2);
        panel p2=new panel("def",2,3);
        panel p3=new panel("ghi",3,1);
        panel p4=new panel("jkl",4,4);
        panel p5=new panel("mno",5,5);
        q.offer(p1);
        q.offer(p2);
        q.offer(p3);
        q.offer(p4);
        q.offer(p5);
        while(!q.isEmpty()) q.poll().disp();
    }
}*/

//emergency patient queue
/*import java.util.*;
class patient{
    String name;
    int sev;
    int time;
    int age;
    patient(String name,int sev,int time,int age){
        this.name=name;
        this.sev=sev;
        this.time=time;
        this.age=age;
    }
    public void treatnext(){
        System.out.println(name);
    }
    public void peeknext(){
        System.out.println(name);
    }
}
public class day8 {
    public static void main(String[] args){
        PriorityQueue<patient> q= new PriorityQueue<>( (a,b) -> {
            if(b.sev != a.sev){
                return b.sev - a.sev;
            }
            if(a.time != b.time){
                return a.time - b.time;
            }
            if(a.age >= 66 || a.age<=12 ){
                return a.age - b.age;
            }
            return a.name.compareTo(b.name);
        }
        );
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patients?");
        int n=sc.nextInt();
        patient[] p=new patient[n];
        for(int i=0; i<n;i++){
            System.out.println("give name,severity,time,age");
            String name=sc.next();
            int sev=sc.nextInt();
            int time=sc.nextInt();
            int age=sc.nextInt();
            p[i]=new patient(name,sev,time,age); 
            q.add(p[i]); 
        }
        System.out.println("patient to treat:");        
        if(!q.isEmpty()) q.poll().treatnext();
        System.out.println("patient to treat next:");
        if(!q.isEmpty()) q.peek().peeknext();
        sc.close();
    }
}*/

//set
import java.util.*;
public class day8 {
    public static void main(String[] args){
        String[] reg = {"c101","c230","c423","c343","c123"};
        String[] pur = {"c101","c765","c343"};
        Set<String> registered = new HashSet<>(Arrays.asList(reg));
        Set<String> purchased = new HashSet<>(Arrays.asList(pur));
        purchased.retainAll(registered);
        System.out.println(purchased);
    }
}
