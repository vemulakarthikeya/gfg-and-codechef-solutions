import java.util.*;

class Codechef {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        // Ask the user to enter the initial water level
        // Read the user input as a double value
        double waterlevel = scanner.nextDouble();
        
        // Start while loop to decrease water level
        while(waterlevel > 10){
            System.out.println("Water level: " + waterlevel +" liters.");
            waterlevel--;
            
        }
        // Alert user when only 10 liters remain
        System.out.println("Warning! Water level is low (10 liters). Please refill the tank!");
        
        scanner.close(); // Close the Scanner
    }
}