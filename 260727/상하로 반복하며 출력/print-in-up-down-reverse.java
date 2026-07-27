import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];
        int start;
        for(int i = 0 ; i < n; i++){
            if(i%2==0){
                start = 1;
                for(int j = 0 ; j<n;j++){
                    arr[i][j]= start;
                    start ++;
                }
            }else{
                start = n;
                for(int j = 0 ; j<n;j++){
                    arr[i][j]= start;
                    start --;
                }
            }
        }

        for(int i = 0 ; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}