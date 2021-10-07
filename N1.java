import java.util.Scanner;

public class N1 {

    static int pow(int a) {
        int ans = 1;
        for(int i = 0; i < a; i++) ans *= 2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(pow(n));

        sc.close();
    }
}
