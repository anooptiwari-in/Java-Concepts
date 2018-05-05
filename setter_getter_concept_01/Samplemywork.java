public class Samplemywork {
    private String line;
    public void setline(String line){
        this.line = line;
    }
       
    public String getline(){
        return this.line;
    }
    
    public static void main(String[] args) {
    Samplemywork s1 = new Samplemywork();
    s1.setline("Day is great!");
    System.out.println(s1.getline());
    }
    
}
