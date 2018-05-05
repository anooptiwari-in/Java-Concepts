//Casting
package casting_concept;

public class Fruit extends Object {
    String colour;
    Double price;
    Fruit(String colour, Double price){
        this.colour = colour;
        this.price = price;
    }
     public void show(){
         System.out.println(colour + " " + price);
     }
     
    public static void main(String[] args) {
        Object f1 = new Fruit("Red",20.5);//Implicit
        Fruit f2 = (Fruit)f1;//Explicit 
        f2.show();
        Fruit a1 = new Apple("Green", 14.56);//Implicit
        Apple a2 = (Apple)a1;//Explicit
        a2.show();
        if(a2 instanceof Fruit){//instanceof operator
            System.out.println("a2 is an instance of Fruit");
        }
            else{
                   System.out.println("a2 is not an instance of Fruit"); 
                    }
        if(f1 instanceof Apple){//instanceof operator
            System.out.println("a1 is an instance of Apple");
        }
            else{
                   System.out.println("a1 is not an instance of Apple"); 
                    }
        }
        
    }
    

