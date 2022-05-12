import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int cnt = 0;
        
        do {
            N = ((N%10)*10) + ((N/10)+(N%10))%10;
            cnt++;
        } while(N != copy);
        System.out.println(cnt);

        
    }
}