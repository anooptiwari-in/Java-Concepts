public class TestThread {

    public static void main(String[] args) {
        PrintDemo pd = new PrintDemo();
        
        ThreadDemo T1 = new ThreadDemo("t1",pd);
        ThreadDemo T2 = new ThreadDemo("t2",pd);
        
        T1.start();
        T2.start();
        
        try{
            T1.join();
            T2.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }

}
