import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        if(num<0){
            System.out.print("minus");
        }
    }
}