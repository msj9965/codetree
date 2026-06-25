import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num = a;
        StringBuilder sb = new StringBuilder();

        while(num<=b){
            sb.append(num).append(" ");
            if(num%2==0){
                num= num+3;
            }else{
                num= num*2;
            }
        }
        System.out.print(sb);
        

    }
}