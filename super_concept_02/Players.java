public class Players {
    String name,gender;
    int age;
    Players(){
      this.name = "Ram";
      this.gender = "Male";
      this.age = 34;
    }
    Players(String name,String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void op(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
    public static void main(String[] args) {
     Cricketer c = new Cricketer("Abhay","Male",36);
     c.op();
     Footballer f = new Footballer();
     f.op();
    }
    
}
