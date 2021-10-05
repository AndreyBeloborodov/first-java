import java.util.Scanner;

public class dz1 {

    static int fact_number(int a) {
        if(a == 0) return 1;
        return a * fact_number(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(fact_number(sc.nextInt()));

        sc.close();
    }
}
