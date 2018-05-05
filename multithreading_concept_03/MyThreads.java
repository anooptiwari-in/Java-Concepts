package multithreading_concept_03;
//Experiment 10.2
public class MyThreads extends Thread {
    Thread t;
    String name;
    
    MyThreads(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Thread Name :"+ name);
        t.start();
    }
    
    @Override
    public void run(){
        if("Even".equals(name)){
           for(int i=2;i<=10;i++){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
            }
        if("Odd".equals(name)){
            for(int i=1;i<=10;i++){
                    if(i%2!=0){
                        System.out.println(i);
                    }
                }
        }
        
        else{
            System.out.println("Wrong Input");
        }
    }
        
    public static void main(String[] args) {
       //System.out.println("Even Numbers");
       new MyThreads("Even");
       //System.out.println("Odd Numbers");
       new MyThreads("Odd");
    }
    
}
