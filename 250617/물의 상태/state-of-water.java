import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String result;

        Scanner sc = new Scanner(System.in);
        int tem = sc.nextInt();
        if(tem<0){
            result = "ice";
        }else if(tem>=100){
            result = "vapor";
        }else{
            result = "water";
        }
        System.out.println(result);
    }
}