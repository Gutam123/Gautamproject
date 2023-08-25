package day10dowwhileloopandforloop;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		
		
		Scanner keyboard =new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=keyboard.nextInt();
		
		if(num%2 ==0) {
			System.out.println(num+"is an even number");
		}else {
			System.out.println(num+"is an odd number");
		}
		

		keyboard.close();
	}

}
