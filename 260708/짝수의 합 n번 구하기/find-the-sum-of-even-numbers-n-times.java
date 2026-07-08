import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int total = 0;

            for(int j = a; j<=b;j++){
                if(j%2==0){
                    total = total + j;
                }
            }

            System.out.println(total);
        }

    }
}