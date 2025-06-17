import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result;
        if(n<1000){
            result = "no";
        }else if(n>=1000&&n<3000){
            result = "mask";
        }else{
            result = "book";
        }

        System.out.print(result);

    }
}