import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num=1;

        while(true){
            num = Integer.parseInt(br.readLine());
            if(num==0){
                break;
            }else{
            System.out.println(num);
            }
        }
    }
}