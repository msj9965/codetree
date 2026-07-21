import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][]arr = new int[n][m];

        for(int i = 0; i <n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i <n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<m;j++){
                
                if(arr[i][j]!=Integer.parseInt(st.nextToken())){
                    sb.append(1).append(" ");
                }else{
                    sb.append(0).append(" ");

                }
                
            }
            sb.append("\n");
        }

        System.out.print(sb);


        
    }
}