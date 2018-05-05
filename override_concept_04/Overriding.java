package override_concept_04;

public class Overriding {

    public void sample_method(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Overriding o = new Overriding();
        o.sample_method();
        Derived_Overriding od = new Derived_Overriding();
        od.sample_method();
    }
    
}
