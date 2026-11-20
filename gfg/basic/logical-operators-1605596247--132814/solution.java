import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();
        

        // code here
        boolean p = x & y;
        boolean q = x || y;
        boolean r = !x;
        boolean s = !y;

        System.out.printf("%s %s %s %s", p ? "True" : "False", q ? "True" : "False",
                          r ? "True" : "False", s ? "True" : "False");
    }
}