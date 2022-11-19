import java.util.Scanner;

public class Greatestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        if (A > B){
            if (A > C){
                System.out.println(A);
            }
            else{
                System.out.println(C);
            }
        }
        else if (B > C){
                System.out.println(B);
            }
        else{
            System.out.println(C);
        }
    }
}
