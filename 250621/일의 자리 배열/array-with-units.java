import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        System.out.print(list.get(0)+" "+list.get(1)+" ");
        for(int i = 1; i<9;i++){
            list.add((list.get(i)+list.get(i-1))%10);
            System.out.print(list.get(i+1)+" ");
        }


    }
}