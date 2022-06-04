import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int pack = 1;
        
        for(int i=1; i<=n; i++) { 
            pack = pack * i;
        }
        
        System.out.print(pack);
    }
}