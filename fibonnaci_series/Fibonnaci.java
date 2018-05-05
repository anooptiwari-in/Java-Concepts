package fibonnaci_series;

import java.util.Scanner;
public class Fibonnaci {

    public static void main(String[] args) {
        int a =0;
        int b = 1;
        System.out.print("Enter the range");
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        while((range-2)>0){
            int sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
            range--;
        }
    }
    
}
