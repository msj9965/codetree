import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array= new int[num];
        for(int i = 0; i<num;i++){
            array[i] = sc.nextInt();
            System.out.print((int)Math.pow(array[i],2)+" ");
        }

    }
}