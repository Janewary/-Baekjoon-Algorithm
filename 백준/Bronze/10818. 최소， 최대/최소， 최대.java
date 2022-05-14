import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] str = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            str[i] = Integer.parseInt(st.nextToken());
        }
        int min = str[0];
        int max = str[0];
        
        for(int i=0; i<N; i++){
            if(min > str[i]){
                min = str[i];
            }
            if(max < str[i]){
                max = str[i];
            }
        }
        System.out.println(min + " " + max);
        
        
        
    }
}