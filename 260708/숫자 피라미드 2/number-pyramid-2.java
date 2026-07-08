import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int num = 0;

        for(int i = 1 ; i<=n;i++ ){
            for(int j = 0; j<i;j++){
                sb.append(++num).append(" ");
            }
            sb.append("\n");
            
            
        }

        System.out.print(sb);
    }
}