import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        // code here
        while(i <= 10){
            System.out.print(n*i + " ");
            i++;
        }
    }
}