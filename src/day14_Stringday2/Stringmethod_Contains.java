package day14_Stringday2;

public class Stringmethod_Contains {

	public static void main(String[] args) {

		
String str = "TechCircle";
        
        System.out.println(str.contains("ch"));
        
        System.out.println(str.contains("c"));

        System.out.println(str.contains("y"));
        
        
        System.out.println(str.indexOf('i'));
        
        System.out.println(str.contains("i"));
        
        
        if (str.indexOf('i') > -1 ) {
            System.out.println("String contains letter i");
        }
        
        if (str.contains("i")) {
            System.out.println("String contains letter i");
        }
        
        if (str.indexOf("t") > -1) {
            System.out.println("String contains letter t");
        }else {
            System.out.println("String do not contains letter t");
        }
        
        
        if (str.contains("t")) {
            System.out.println("String contains letter t");
        }else {
            System.out.println("String do not contains letter t");
        }
	}
}