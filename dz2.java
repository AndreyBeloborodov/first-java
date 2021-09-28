import java.io.IOException;

public class dz2 {
    public static void main(String[] args) throws IOException {

        char[] abc = {
            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
               'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                  'z', 'x', 'c', 'v', 'b', 'n', 'm'
        };

        char letter = (char) System.in.read();

        for(int i = 0; i < 26; i++) {
            if(abc[i] == letter) {
                System.out.print(abc[(i + 1) % 26]);
            }
        }

    }
}
