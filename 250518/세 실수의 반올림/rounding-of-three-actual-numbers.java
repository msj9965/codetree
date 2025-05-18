import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      // Please write your code here.
      Scanner sc = new Scanner(System.in);
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();
      double num3 = sc.nextDouble();
      System.out.printf("%.3f \n",Math.round(num1*1000)/1000.0);
      System.out.printf("%.3f \n",Math.round(num2*1000)/1000.0);
      System.out.printf("%.3f \n",Math.round(num3*1000)/1000.0);

    }
} 