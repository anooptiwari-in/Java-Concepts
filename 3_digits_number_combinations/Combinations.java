import java.util.Scanner;
public class Combinations {

    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter 3 digits in range 0-9"); 
        for (int v=0;v<3;v++){
            num[v] = s.nextInt();
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!= j && j!= k && j!= i && i!=k){
                    System.out.println(num[i]*100+num[j]*10+num[k]);    
                    }
                }
            }
        }
         
    }
    
}
