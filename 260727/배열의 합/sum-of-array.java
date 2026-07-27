import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i = 0 ; i<4;i++){
            st = new StringTokenizer(br.readLine());
            int total = 0;
            while(st.hasMoreTokens()){
                total = total + Integer.parseInt(st.nextToken());

            }
            System.out.println(total);
        }
    }
}