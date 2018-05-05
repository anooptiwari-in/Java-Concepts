public class Arithmetic implements Test{
    int num;
    Arithmetic(int num){
        this.num = num;
    }
    
    @Override
    public void square(){
        System.out.println(num*num);
    }
    
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic(3);
        a.square();
    }
   
}
