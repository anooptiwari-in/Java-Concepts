public class EvenOddThreads implements Runnable {
    String name;
    Thread t;
    EvenOddThreads(String threadname){
        this.name = threadname;
        t = new Thread(this, name);
        t.start();
    }
    
    @Override
    public void run(){
        if(name == "Even"){
            try{
                for(int i =1;i<=10;i++){
                    if(i%2==0){
                    System.out.println(name + " " + i);
                }
            }
            }catch(Exception e){
                    System.out.println(name + " Thread Stopped");
                    }
            System.out.println(name + " Thread Exits");
            }
        
        else if (name == "Odd"){
            try{
                for(int i =1;i<=10;i++){
                    if(i%2!=0){
                    System.out.println(name + " " + i);
                }
            }
            }catch(Exception e){
                    System.out.println(name + " Thread Stopped");
                    }
            System.out.println(name + " Thread Exits");
            }
            
        else{
                System.out.println("Wrong Inputs");
            }
        
        }    
}
