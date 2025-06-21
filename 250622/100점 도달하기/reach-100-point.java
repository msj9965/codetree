import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        for(int i = N; i<=100;i++){
            num = i/10;
            switch(num){
                case 10:
                    System.out.print("A ");
                    break;
                case 9: 
                    System.out.print("A ");
                    break;
                case 8: 
                    System.out.print("B ");
                    break;
                case 7: 
                    System.out.print("C ");
                    break;
                case 6: 
                    System.out.print("D ");
                    break;
                default: 
                    System.out.print("F ");
                    break;
            }
        }
        

    }
}