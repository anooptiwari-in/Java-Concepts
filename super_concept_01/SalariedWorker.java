package super_concept_01;

public class SalariedWorker extends Worker {
    SalariedWorker(String name, Double salary_rate, int week){
        super(name, salary_rate,week);
    }
    static int week_s;
    static Double pay_s, salary_rate_s;
    public static void ComPay(Object x){
        pay_s = salary_rate_s * week_s;
        System.out.println(pay_s);
    }
}
