package override_concept_01;

abstract class Vehicle {
    
    String name;
    
    void display(){
        System.out.println(name); 
    }
        
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        c1.display();
    }
  
}
