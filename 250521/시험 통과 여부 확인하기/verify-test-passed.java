import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=80){
            System.out.print("pass");
        }else{
            int more = 80- num;
            System.out.println(more + " more score");

        }
    }
}