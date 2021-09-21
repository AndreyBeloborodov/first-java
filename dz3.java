import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ok_vozr = true;
        boolean ok_ubiv = true;
        boolean ok_ravn = true;

        int buf = 0;

        while(true) {
            int x = sc.nextInt();
            if(x == 0) break;
            if(buf == 0) {
                buf = x;
                continue;
            }

            ok_ravn &= (x == buf);
            ok_ubiv &= (x <= buf);
            ok_vozr &= (x >= buf);

            buf = x;
        }

        char ans = '!';

        if(ok_ubiv) ans = '>';
        if(ok_vozr) ans = '<';
        if(ok_ravn) ans = '=';

        System.out.print(ans);

        sc.close();
    }
}
