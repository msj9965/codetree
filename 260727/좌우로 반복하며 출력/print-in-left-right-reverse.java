import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i<=n; i++){
            sb.append(i);
        }

        int count = 0;
        do{
            System.out.println(sb);
            sb.reverse();
            count++;
        }while(count<n);
    }
}