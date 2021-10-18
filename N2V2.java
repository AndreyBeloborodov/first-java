import java.util.Scanner;

public class N2V2 {

    static boolean okey(int a) {
        boolean ok = true;
        while(a > 0) {
            ok &= ((a % 10) % 2 == 0);
            a /= 10;
        }
        return ok;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean answer = false;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            answer |= okey(a);
        }

        if(answer) System.out.print("Yes");
        else System.out.print("No");

        sc.close();
    }
}