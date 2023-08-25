package day14_Stringday2;

public class task3 {
import
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        System.out.print("Enter the substring: ");
	        String substring = scanner.nextLine();

	        if (mainString.contains(substring)) {
	            System.out.println("Substring found in the main string.");
	        } else {
	            System.out.println("Substring not found in the main string.");
	        }

	        scanner.close();
	    }
}

	


