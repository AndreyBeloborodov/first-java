import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean ok = true;

        ok &= (a + b > c);
        ok &= (a + c > b);
        ok &= (b + c > a);

        String answer;

        if(ok) answer = "Yes";
        else answer = "No";

        System.out.print(answer);

        sc.close();
    }
}
