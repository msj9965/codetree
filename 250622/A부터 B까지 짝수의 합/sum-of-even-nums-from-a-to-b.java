import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        for(int i = A; i<=B;i++){
            if(i%2==0){
                result = result + i;
            }
            
        }
        System.out.print(result);
    }
}