
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while(i <= n){
            System.out.println(i);
            i += 1;
        }
    }
}