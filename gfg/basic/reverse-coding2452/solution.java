import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int count=0;
        for(int i = n ; i >= 1 ; i--){
            count += i;
        }
        System.out.println(count);
    }
}