import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int cap = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < cap; i++){
            int k = scanner.nextInt();
            if (k%6==0){
                count+=k;
            }
        }
        System.out.println(count);
    }
}