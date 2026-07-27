import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer = 0;
        for(int i = 0; i<4;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                if(Integer.parseInt(st.nextToken())%5==0){
                    answer++;
                }
            }
        }

        System.out.print(answer);
    }
}