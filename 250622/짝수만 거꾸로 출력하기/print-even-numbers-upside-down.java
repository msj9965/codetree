import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<N;i++){
            array[i]= sc.nextInt();
            if(array[i]%2==0){
                list.add(array[i]);
            }

        }
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }

    }
}