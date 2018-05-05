package override_concept_03;

public class People implements People_prop {
    String name;
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void showName(){
        System.out.println(name);
    }
    
    
    public static void main(String[] args) {
        People obj = new People();
        obj.setName("Satayajeet");
        obj.showName();
        Student obj2 = new Student();
        obj2.setName("Anoop");
        obj2.showName();
    }
    
}
