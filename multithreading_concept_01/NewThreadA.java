package multithreading_concept_01;

public class NewThreadA extends Thread {
    NewThreadA(){
        super("Demo Thread");
        System.out.println("Child Thread" + this);
        this.start();
    }
    
    public void run(){
        try { 
            for(int i=5;i>0;i--){
                System.out.println("Child Thread" +i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Child Thread Exits");
    }
}
