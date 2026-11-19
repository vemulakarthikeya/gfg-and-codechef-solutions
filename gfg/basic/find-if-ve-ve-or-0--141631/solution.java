import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(n == 0){
            System.out.print("Zero");
        }
        else if(n <= max && n > 0){
            System.out.print("Positive");
        }
        else{
            System.out.print("Negative");
        }
    }
}