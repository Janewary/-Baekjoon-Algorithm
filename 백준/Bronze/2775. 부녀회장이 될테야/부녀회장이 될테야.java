import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) { 
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            int num = f(k, n);
        
            System.out.println(num);
        }
        
    }
    public static int f(int K, int N) { 
        int sum = 0;
        
        if(K == 1) { 
            for(int i = 1; i <= N; i++) { 
            sum = sum + i;
            }
        }
        else { 
            for(int i = 1; i <= N; i++) {
                sum = sum + f(K - 1, i);
            }
        }
        
        return sum;
    }
}