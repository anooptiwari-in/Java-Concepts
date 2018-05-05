
package super_concept_01;

public class Worker {
    String name;
    static Double salary_rate, pay;
    static int days;
    
    Worker(String name, Double salary_rate, int days){
        this.name = name;
        Worker.salary_rate = salary_rate;
        Worker.days = days;
    }
    public static void ComPay(Object x){
        pay = salary_rate * days;
        System.out.println(pay);
    }
        
    public static void main(String[] args) {
       ComPay(new DailyWorker("Sharma",10.5,5));
       ComPay(new SalariedWorker("Gupta",10.5,10));
         }
    }
