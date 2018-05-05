public class Person {
    String name;
    Person(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Raj");
        Person p2 = new Person("Ram");
        p1 = (Person)p2;
        System.out.println(p2.equals(p1));
    }
    
}
