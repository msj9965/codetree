import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(1, 'a');
        sb.setCharAt(s.length()-2,'a');
        System.out.print(sb.toString());
    }
}