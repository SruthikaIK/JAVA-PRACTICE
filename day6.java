//stack operations
//import java.util.*;
/*public class day6 {
    public static void main(String[] args) {
        Scanner ss =new Scanner(System.in);
        Stack<Integer> s =new Stack<>();
        System.out.println("1.push\n2.pop\n3.peek\n4.isempty\n5.size\n6.display\n-1.exit");
        while(true){
            System.out.print("\nEnter choice: ");
            int n = ss.nextInt();
            if (n ==-1) {
                System.out.println("Exit");
                break;
            }
            switch (n) {
                case 1: {
                    System.out.print("Enter value to push: ");
                    int a = ss.nextInt();
                    s.push(a);
                    break;
                }
                case 2: {
                    if (s.isEmpty()) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped: "+s.pop());
                    }
                    break;
                }
                case 3: {
                    if (s.isEmpty()) {
                        System.out.println("Stack empty");
                    } else {
                        System.out.println("Top element: "+s.peek());
                    }
                    break;
                }
                case 4: {
                    System.out.println(s.isEmpty());
                    break;
                }
                case 5: {
                    System.out.println("Size: "+ s.size());
                    break;
                }
                case 6:{
                    if (s.isEmpty()){
                        System.out.println("Stack empty");
                    } 
                    else{
                        for(int i=s.size()-1; i>=0;i--){
                            System.out.print(s.get(i)+" ");
                        }
                        System.out.println();
                    }
                    break; 
                }
                default:{
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
        ss.close(); 
    }
}*/

//reverse the words
/* 
public class day6 {
    static StringBuilder rev(String a) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse();
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String st ="this is java placement class";
        String[] t =st.split(" ");
        for (int i=0;i<t.length;i++){
            stack.push(t[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(rev(stack.pop()) + "");
        }
    }
}*/ 

//undo redo
import java.util.Stack;
public class day6 {
    private Stack<String> undostack = new Stack<>();
    private Stack<String> redostack = new Stack<>();
    private String curtext = " ";
    public void type(String text){
        undostack.push(curtext);
        curtext = curtext + text;
        redostack.clear();
        display();
    }
    public void undo(){
        if(!undostack.isEmpty()){
            redostack.push(curtext);
            curtext = undostack.pop();
            display();
        }
        else{
            System.out.println("Nothing to undo");
        }
    }
    public void redo(){
        if(!redostack.isEmpty()){
            undostack.push(curtext);
            curtext = redostack.pop();
            display();
        } 
        else{
            System.out.println("Nothing to redo");
        }
    }
    public void display(){
        System.out.println("Current Text: \"" + curtext + "\"");
    }
    public static void main(String[] args){
        day6 editor = new day6();
        editor.type("Hello");
        editor.type(" World");
        editor.type("!");
        editor.undo();
        editor.undo();
        editor.redo();
        day6 editor2 = new day6();
        editor2.type("Hello");
        editor2.type(" World");
        editor2.undo();
        editor2.type(" Java");
        editor2.redo();
    }
}
