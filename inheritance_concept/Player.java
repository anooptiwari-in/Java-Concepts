public class Player {

    public String name;
    public int age, career_year;
    public void setname(String name){
        this.name = name;
    }
    public void setCareer(int career_year){
        this.career_year = career_year;
    }
    public void setage(int age){
        this.age = age;
    }
    public void getdata(){
        System.out.println(name + " is " + age + " years old and started career in " + career_year);
    }
    public static void main(String[] args) {
        Cricket sam_c = new Cricket();
        sam_c.setname("Sachin Tendulkar");
        sam_c.setCareer(1989);
        sam_c.setage(42);
        sam_c.getdata();
        Football sam_f = new Football();
        sam_f.setname("Ronaldo");
        sam_f.setCareer(1996);
        sam_f.setage(39);
        sam_f.getdata();
        Hockey sam_h = new Hockey();
        sam_h.setname("Dhanraj Pillai");
        sam_h.setCareer(1992);
        sam_h.setage(44);
        sam_h.getdata();
    }
    
}
