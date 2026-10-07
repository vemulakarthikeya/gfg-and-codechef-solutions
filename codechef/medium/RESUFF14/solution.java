import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        boolean bookingStatus = sc.nextBoolean();
        String roomType = sc.next();
        if(bookingStatus == true){
            if(roomType == "Luxury"){
                System.out.println("Welcome to your Luxury Suite!");
            }else{
                System.out.println("Welcome to your Standard Room!");
            } 
        }
        else {
            System.out.println("Booking not found. Please check your details.");
        }
        System.out.println("Reservation check completed.");
    }
}
