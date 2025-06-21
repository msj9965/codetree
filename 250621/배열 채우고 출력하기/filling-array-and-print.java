import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        ArrayList<String>list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.next());

        }
        for(int i = list.size()-1; i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}