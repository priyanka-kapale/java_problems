import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("odd");
        }
    }
}

