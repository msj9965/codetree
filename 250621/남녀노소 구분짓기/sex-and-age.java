import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();

        if(sex==1){
            if(age>=19){
                System.out.println("WOMAN");
            }else{
                System.out.println("GIRL");
            }
        }else{
            if(age>=19){
                System.out.println("MAN");
            }else{
                System.out.println("BOY");
            }
        }
    }
}