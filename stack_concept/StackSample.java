import java.util.Stack;
public class StackSample {
        
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
    }
    
}
