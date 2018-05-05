public class StringOperations {
    
    public static void main(String[] args) {
        String name = "anoop";
        System.out.println(name.length());
        System.out.println(name.contains("a"));
        
        int count= 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'){
                count++;
            }
        }    
        System.out.println(count);
       }
}
