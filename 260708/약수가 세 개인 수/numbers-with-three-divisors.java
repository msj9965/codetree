import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int answer=0;
        for(int i = start ; i<=end;i++){
            int total=0;
            for(int j = 1; j<=i;j++){
                if(i%j==0){
                    total++;
                }
                
                if(total>3){
                    break;
                }
            }
            if(total==3){
                answer++;
            }
        }

        System.out.print(answer);


    }       
}