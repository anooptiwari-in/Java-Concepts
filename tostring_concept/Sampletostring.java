
package tostring_concept;

public class Sampletostring {
    String word;
    Sampletostring(String word){
        this.word = word;
    }
    public void show(){
        System.out.println(word);
    }
    public static void main(String[] args) {
        Sampletostring s = new Sampletostring("Hello");
        System.out.println(s.toString());
    }
    
}
