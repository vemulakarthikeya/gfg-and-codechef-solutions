import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for total books and number of students
        int totalBooks = scanner.nextInt();
        int students = scanner.nextInt();

        // Calculating books per student and remaining books
        int each = totalBooks/students;
        int remaining = totalBooks%students;

        // Printing the output based on the condition
        if(remaining == 0){
        System.out.println("Each student gets " +each+" books equally.");
        }else{
        System.out.println("Each student gets " +each+" books equally,but " +remaining+" books remain undistributed.");
        }
    }
}
