import java.util.Scanner;
public class ArraySum {

    public static void main(String[] args) {
       Double[] num = new Double[10];
       Scanner in = new Scanner(System.in);
       System.out.println("Enter 10 numbers");
       for(int i=0;i<10;i++){
           num[i]= in.nextDouble();
       }
       Double k = 0.0;
       for(int i=0;i<10;i++){
           k = k + Math.pow(num[i],2);
       }
       System.out.println("Sum = " + k);
       
    }
    
}
