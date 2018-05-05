package multithreading_concept_04;

public class MultiThreadDemo {

    public static void main(String[] args) {
       new NewThread("One");
       new NewThread("Two");
       new NewThread("Three");
       new NewThread("Four");
       
       try{
           Thread.sleep(10000);
       } catch(InterruptedException e){
           System.out.println("Main Thread Interrupted");
         }
       System.out.println("Main Thread Exiting");
    }
    
}
