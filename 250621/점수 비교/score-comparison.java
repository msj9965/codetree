import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A_math = sc.nextInt();
        int A_en = sc.nextInt();
        int B_math = sc.nextInt();
        int B_en = sc.nextInt();
        if(A_en>B_en&&A_math>B_math){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}