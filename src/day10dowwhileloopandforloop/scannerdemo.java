package day10dowwhileloopandforloop;

import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args) {
		
		
// dataType variableName =value;
		Scanner Keyboard = new Scanner(System.in);

		
		System.out.println("what is your name");
		
		
		String name = Keyboard.next();
		
		System.out.println("Hello+name");
		
		System.out.println("How old are you?");
		
		int age =Keyboard.nextInt();
		
		System.out.println(name +"is"+age+"old.");
		
		
		Keyboard.close();
	}

}
