public class Puppy {
    int PuppyAge;
    public Puppy(String name){
        System.out.println("Puppy's name is " + name);
    }
    public void setAge(int age){
        PuppyAge = age;        
    }
    public void getAge(){
        System.out.println("Puppy's age is " + PuppyAge);
    }
    public static void main(String[] args) {
    Puppy mypuppy = new Puppy("tommy");
    mypuppy.setAge(5);
    mypuppy.getAge();
    }
    
}
