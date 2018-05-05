public class PrintDemo {
    public void printCount(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println("Thread Stopped");
        }
        System.out.println("Thread Exiting");
    }
}
