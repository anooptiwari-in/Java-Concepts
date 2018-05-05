package multithreading_concept_06;

public class CurrentThreadDemo {

    
    public static void main(String[] args) {
        Thread t = Thread.currentThread();//Returns a reference to the currently executing thread object.
        System.out.println(Thread.currentThread());
        System.out.println(t.getName());//Name of the thread
        System.out.println(t.getPriority());//Priority of the thread
        System.out.println(t.isAlive());//Is thread still running?
             
    }
    
}
