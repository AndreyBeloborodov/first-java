import java.util.Scanner;

public class dz4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[][] answer = new boolean[2 * n][4 * n - 1];

        int i = 0, j = (4 * n - 1) / 2;

        for(int cnt = 0; cnt < n; cnt++) {
            int l = j - cnt, r = j + cnt;
            for(int t = l; t <= r; t++)answer[i][t] = true;
            i++;
        }

        i = n; j = n - 1;

        for(int cnt = 0; cnt < n; cnt++) {
            int l = j - cnt, r = j + cnt;
            for(int t = l; t <= r; t++)answer[i][t] = true;
            i++;
        }

        i = n; j = 3 * n - 1;

        for(int cnt = 0; cnt < n; cnt++) {
            int l = j - cnt, r = j + cnt;
            for(int t = l; t <= r; t++)answer[i][t] = true;
            i++;
        }

        for(int it1 = 0; it1 < 2 * n; it1++) {
            String ans = "";
            for(int it2 = 0; it2 < 4 * n - 1; it2++) {
                if(answer[it1][it2]) ans += "* ";
                else ans += "  ";
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
