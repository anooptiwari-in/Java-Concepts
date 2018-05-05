
package multithreading_concept_02;
//Creates a second thread
class NewThread implements Runnable {
    Thread t;
    NewThread(){
        t = new Thread(this,"Mera Thread");//this calls the run method of class when obj created
        System.out.println("Child Thread: " +t);
        t.start();
    }
    //Entry point for second thread
    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: " +i);
                Thread.sleep(500);
                }
        } catch(InterruptedException e){
            System.out.println("Child Interrupted");
            }
           System.out.println("Exiting Child Thread");
               
    }
      
    
}
