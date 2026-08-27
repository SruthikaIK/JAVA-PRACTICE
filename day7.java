//prefix postfix conversion
/*import java.util.*;
public class day7 {
    static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixtopostfix(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length(); i++){
            char c =s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res.append(c);
            }
            else if(c=='('){
                stack.push(c);
            } 
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } 
            else{
                while(!stack.isEmpty() && (c=='^'?precedence(c)<precedence(stack.peek()):precedence(c)<=precedence(stack.peek()))){
                    res.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }

    public static String infixtoprefix(String s){
        StringBuilder res = new StringBuilder(s).reverse();
        char[] ch = res.toString().toCharArray();
        for(int i = 0; i < ch.length; i++){
            if (ch[i] == '(') ch[i] = ')';
            else if (ch[i] == ')') ch[i] = '(';
        }
        String post = infixtopostfix(new String(ch));
        return new StringBuilder(post).reverse().toString();
    }

    public static void main(String[] args) {
        String infix ="fe%dc-/ba*+";
        System.out.println("Infix: " +infix);
        System.out.println("Prefix: " +infixtoprefix(infix));
        System.out.println("Postfix: " +infixtopostfix(infix));
    }
} */

//queue
/*import java.util.*;
public class day7 {
    public static void main(String[] args) {
        Queue <String> queue=new LinkedList<>();
        queue.offer("1");
        for(int i=0; i<10; i++){
            String cur=queue.poll();
            System.out.println(cur);
            queue.offer(cur+"0");
            queue.offer(cur+"1");
        }
    }
    
}*/

//queue
/*import java.util.*;
class printer{
    private String clr;
    private int num;
    printer(String clr,int num){
        this.clr =clr;
        this.num =num;
    }
    public void print(){
        System.out.println(clr + "-" + num);
    } 
}
public class day7{
    public static void main(String[] args){
        Queue<printer> q=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        printer p1 = new printer("green",2);
        printer p2= new printer("blue",4);
        printer p3= new printer("bw",5);
        printer[] p={p1,p2,p3};
        for(int i=0;i<3;i++) {
            System.out.println("which to print(1-3):");
            int ch = sc.nextInt();
            printer o=p[ch-1];
            if(!q.contains(o)) q.offer(o);
        }
        System.out.println("Colour and copies in the order:");
        while(!q.isEmpty()) q.poll().print();
        sc.close();
    }
}*/