import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1=0;
        int n2=0;
        int temp;
        for(int i = 0; i<10;i++){
             temp = sc.nextInt();
             if(temp%3==0){
                n1++;
             }
             if(temp%5==0){
                n2++;
             }

        }
        System.out.print(n1+" "+n2);
    }
}