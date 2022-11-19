

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int salary = input.nextInt();
        int salary = 3000;
        if (salary > 10000){
            salary += 2000;       // salary = salary + 2000
        }
        else if (salary > 20000){
            salary +=3000;        // salary = salary + 3000
        }
        else{
            salary += 1000;        // salary = salary + 1000
        }

        System.out.println("Your salary is " + salary);
    }
}
