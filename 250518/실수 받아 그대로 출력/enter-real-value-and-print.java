import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        System.out.print(Math.round(N*100)/100);
    }
}