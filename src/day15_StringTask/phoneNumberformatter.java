package day15_StringTask;

public class phoneNumberformatter {

	public static void main(String[] args) {
	
//      textString Formatting for Phone Numbers: 
//      Build a program that takes a string of digits representing a phone number
//      and formats it into a more readable format (e.g., "(123) 456-7890")
//                            0123456789
      String phoneNumber = "2021251245";
//      output  = (703) 123-1234
      
      String part1 = phoneNumber.substring(0,3);
      System.out.println(part1);
      
      String part2 = phoneNumber.substring(3,6);
      System.out.println(part2);
      
      String part3 = phoneNumber.substring(6);
      System.out.println(part3);
      
      String formattedPhoneNumber = "("+part1+") "+part2+"-"+part3;
      String formattedPhoneNumber2 = "".concat("(").concat(part1).concat(") ").concat(part2).concat("-").concat(part3);

      System.out.println(formattedPhoneNumber);
      System.out.println(formattedPhoneNumber2);

	}
}
