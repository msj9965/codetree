import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for(int i = 1; i<=100;i++){
            result = i+ result;
            if(result>=N){
                System.out.print(i);
                break;
            }

        }
    }
}