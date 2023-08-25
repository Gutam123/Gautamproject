package day15_StringTask;

public class vowelcounters {

	public static void main(String[] args) {
		
//      Vowel Counter: 
//      Build a program that counts the number of vowels (a, e, i, o, u) in a given string.

//      String str = "java";
//      output : 2

      String input = "java";
////      
////      output = 3
//
      String vowels = "aeiou";
      int count = 0;

//      char letter = 'e';
//      System.out.println(vowels.indexOf(letter)); //0
//      
//      
//      
//      if (vowels.indexOf(letter) > -1) {
//          
//      }

      for (int i = 0; i < input.length(); i++) {
          char currentLetter = input.charAt(i);

          System.out.println(currentLetter);

          if (vowels.indexOf(currentLetter) > -1) {
              count++;
          }
      }

      System.out.println(input + " has " + count + " vowels.");

//      String str = "Hello";
//      String vowls = "aeiou";
//      int count = 0;
//      for (int i = 0; i < str.length(); i++) {
//          for (int j = 0; j < vowls.length(); j++) {
//              if (str.charAt(i) == vowls.charAt(j)) {
//                  count++;
//                  break;
//
//              }
//
//          }
//
//      }
//
//      System.out.println(count);

  }

}