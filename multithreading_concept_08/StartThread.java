public class StartThread {
    public static void main(String[] args) {
        EvenOddThreads obe = new EvenOddThreads("Even");
        try{
            obe.t.join();
           } catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        
        EvenOddThreads obo = new EvenOddThreads("Odd");
        try{
            obo.t.join();
        } catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
     }    
}
