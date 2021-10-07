import java.util.Scanner;

public class N3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int buf = 0, ans = 0, cnt = 0;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(cnt == 0) {
                buf = a;
                cnt = 1;
                continue;
            } 
            if(a == buf) {
                cnt++;
                continue;
            }
            if(cnt > ans) ans = cnt;
            cnt = 0;
        }

        System.out.print(ans);

        sc.close();
    }
}
