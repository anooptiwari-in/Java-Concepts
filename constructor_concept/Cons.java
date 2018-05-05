package constructor_concept;

class Cons {
    int a,b;
    Cons(int a,int b){
        this.a = a;
        this.b = b;
    }
    
    Cons(){
        a = 5;
        b = 6;
    }
    
    public void sum(){
        System.out.println(a + b);
    }
    
    public static void main(String[] args) {
        Cons c1 = new Cons();
        c1.sum();
        Cons c2 = new Cons(2,3);
        c2.sum();
    }
    
}
