import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A>B){
            if(A<C){
                System.out.print(A);
            }else{
                if(B<C){
                    System.out.print(C);
                }else{
                    System.out.print(B);
                }
            }
        }else{
            if(B<C){
                System.out.print(B);
            }else{
                if(A<C){
                    System.out.print(C);
                }else{
                    System.out.print(A);
                }
            }
        }
    }
}