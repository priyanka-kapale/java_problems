
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i += 1;
        } while (i <= n);
    }
}
