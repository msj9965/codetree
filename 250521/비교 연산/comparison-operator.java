import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 =0;
        int result2 =0;
        int result3 =0;
        int result4 =0;
        int result5 =0;
        int result6 =0;

        if(a>=b){
            result1 =1;
        }
        if(a>b){
            result2=1;
        }

        if(b>=a){
            result3=1;
        }
        if(b>a){
            result4=1;
        }

        if(a==b){
            result5=1;
        }
        if(a!=b){
            result6=1;
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}