import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        while(true) {
            int x = sc.nextInt();
            if(x == 0) break;
            ok |= (x == 5);
        }

        String ans;

        if(ok) ans = "yes";
        else ans = "no";

        System.out.print(ans);

        sc.close();
    }
}
