package access_modifiers_concept;


public class Amodifier {
    int a,b;
    
    Amodifier(int a, int b){
    this.a = a;
    this.b = b;
    }
    
    private int sum(){
        return a + b;
    }
    
    protected int diff(){
        return a-b;
    }
    
    public void show_sum(){
        System.out.println(sum());
    }
    
    void show_diff(){
        System.out.println(diff());
    }
    
    public static void main(String[] args) {
       Amodifier a = new Amodifier(1,2);
       a.sum();
       a.show_sum();
       Amodifier da = new derived_amodifier(5,3);
       da.diff();
       da.show_diff();
            
    }
    
}
