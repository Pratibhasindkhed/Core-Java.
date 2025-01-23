package ANP_D0453;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        // Calculate the perimeter
        double perimeter = 4 * side;
        
        // Display the result
        System.out.println("The perimeter of the square is: " + perimeter);
        
        scanner.close();
    }
}
		

	
/*

*Enter the side length of the square: 12
The perimeter of the square is: 48.0

*/