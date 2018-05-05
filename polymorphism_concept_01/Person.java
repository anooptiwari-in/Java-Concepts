package polymorphism_concept_01;

public class Person extends Object{
       
    public static void show(Object x){
        System.out.println(x.toString());
    }
    public static void main(String[] args) {
       show(new Student());
       show(new GraduateStudent());
    }
   
}
