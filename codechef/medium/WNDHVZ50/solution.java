import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for delivery conditions
        boolean b = scanner.nextBoolean();
        int num = scanner.nextInt();


        // Checking eligibility for same-day delivery
        if(b==true || num <= 15){
            System.out.println("Package qualifies for same-day delivery.");
        }else{
            System.out.println("Package does not qualify for same-day delivery.");
        }




    }
}
