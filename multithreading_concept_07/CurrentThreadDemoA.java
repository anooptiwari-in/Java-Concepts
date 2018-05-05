package multithreading_concept_07;

public class CurrentThreadDemoA {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " +t);
        
        t.setName("Mera Thread");//Change name of thread
        System.out.println("New Thread: " +t);
        
        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }
        
       
    }
    
}
