import java.util.Scanner;

public class dz1 {

    static boolean simple_number(int a) {
        for(int i = 2; i * i <= a; i++) {
            if(a % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        String answer;

        if(simple_number(n)) answer = "Yes";
        else answer = "No";

        System.out.print(answer);

        sc.close();
    }
}
