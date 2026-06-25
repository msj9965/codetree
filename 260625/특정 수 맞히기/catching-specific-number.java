import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        while(true){
            num = Integer.parseInt(br.readLine());
            if(num > 25){
                System.out.println("Lower");
            }else if(num<25){
                System.out.println("Higher");
            }else{
                System.out.print("Good");
                break;
            }
        }
    }
}