package override_concept_02;

public class Person {

    String name;
    int age;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    
    public static void main(String[] args) {
        Person p = new Person("Vijay",56);
        p.display();
        Person s = new Student("Vishal",23);
        s.display();
        Person ss = new SchoolStudent("Sameer",14);
        ss.display();
    }
    
}
