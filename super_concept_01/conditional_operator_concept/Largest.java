public class Largest {
    int a,b,c;
    Largest(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void large(){
        System.out.println(a>b&&a>c?a:b>c?b:c);
    }
    
    public static void main(String[] args) {
        Largest obj = new Largest(-5,7,1);
        obj.large();
    }
}
