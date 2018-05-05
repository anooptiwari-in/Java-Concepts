package polymorphism_concept_02;
public class Animal {
    public static void Msg(Object x){
        System.out.println(x.toString());
    }
    @Override
    public String toString(){
        return "Nothing";
    }
    public static void main(String[] args) {
        Msg(new Dog());
               
    }
    
}
