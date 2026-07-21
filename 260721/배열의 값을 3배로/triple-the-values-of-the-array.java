import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<3;i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j<3;j++){
                sb.append(Integer.parseInt(st.nextToken())*3).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}