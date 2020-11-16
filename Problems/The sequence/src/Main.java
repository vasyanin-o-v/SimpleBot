import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System. in);
        int n = scanner.nextInt();
        int i = 1;
        int count = 0;
        int icount = 1;
        for (; count < n; ){
            System.out.print(i + " ");
            count++;
            icount++;
            if (icount >= i){
                i++;
                icount=0;
            }
        }
    }
}