import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int x = sc.nextInt();
            if(x == 0) break;
            sum += x;
        }

        System.out.print(sum);

        sc.close();
    }
}
