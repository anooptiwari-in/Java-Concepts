public class ThreadDemo extends Thread{
    Thread t;
    String threadname;
    PrintDemo pd;
    
    ThreadDemo(String threadname, PrintDemo pd){
        this.threadname=threadname;
        this.pd=pd;
    }
    
    @Override
    public void run(){
        synchronized(pd){
            pd.printCount();
        }
    System.out.println(threadname + " exiting");
    }
    
}
