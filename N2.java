import java.util.Scanner;

public class N2 {

    static boolean ok(int a) {
        boolean bol = false;
        while(a > 0) {
            bol |= ((a % 10) == 3 || (a % 10) == 5);
            a /= 10;
        }
        return bol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean ans = true;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ans &= ok(a);
        }

        if(ans) System.out.print("Yes");
        else System.out.print("No");

        sc.close();
    }
}
