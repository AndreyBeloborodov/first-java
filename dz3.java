import java.util.Scanner;

public class dz3 {

    static boolean simple_number(int a) {
        for(int i = 2; i * i <= a; i++) if(a % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(simple_number(n)) {
            System.out.print("Prime");
            return;
        }

        System.out.print(1);

        int cur = 2;

        while(n > 1) {
            while(n % cur != 0 || !simple_number(cur)) cur++;
            while(n % cur == 0) {
                System.out.print(" * " + cur);
                n /= cur;
            }
        }

        sc.close();
    }
}
