
package queue_concept;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> x = new ArrayList<>(5);
    
    public void enque(int a){
        x.add(a);
    }
    
    public void deque(){
        x.remove(0);
    }
    
    public void display(){
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.deque();
        q.deque();
        q.enque(5);
        q.enque(67);
        q.deque();
        q.display();
    }
    
}
