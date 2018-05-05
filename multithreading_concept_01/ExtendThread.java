package multithreading_concept_01;

public class ExtendThread {
    public static void main(String[] args) {
            new NewThreadA();
         try { 
            for(int i=5;i>0;i--){
                System.out.println("Main Thread" +i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main Thread Exits");
    }
}
