import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        // code here
        int val1 = (n-1);
        int res = a + (val1*d);
        System.out.println(res);
    }
}
