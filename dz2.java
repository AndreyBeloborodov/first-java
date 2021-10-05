import java.util.Scanner;

public class dz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(), m = sc.nextInt();

        while(k % 3 != 0)k++;
        while(m % 3 != 0)m--;
        while(k <= m) {
            System.out.print(k + " ");
            k += 3;
        }

        sc.close();
    }
}
