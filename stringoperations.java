public class stringoperations {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.toUpperCase());        
        System.out.println(s.toLowerCase());        
        System.out.println(s.contains("e"));        
        System.out.println(s.startsWith("H"));      
        System.out.println(s.endsWith("o"));        
        System.out.println(s.replace("el", "le"));  
        System.out.println(s.substring(1, 3));     

        System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));

        System.out.println(s.trim());               
        System.out.println(s.length());             
        System.out.println(s.charAt(0));   
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
