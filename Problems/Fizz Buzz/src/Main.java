import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();

        for (int i = first; i <= last; i++) {
            if (i % 3 == 0 && i % 5 == 0) {System.out.println("FizzBuzz");}
            else if (i % 5 == 0) {System.out.println("Buzz");}
            else if (i % 3 == 0) {System.out.println("Fizz");}
            else {System.out.println(i);}

        }
    }
}
