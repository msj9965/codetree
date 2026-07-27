import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum=0;
        for(int i = 1; i<=4;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<i;j++){
                sum = sum + Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(sum);
    }
}