//It depends on the processor that how many child threads will it execute when the main thread is on sleep
package multithreading_concept_02;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        
        try {
            for(int i=5;i>0;i--){
                System.out.println("Main Thread" + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");        
    }    
}
