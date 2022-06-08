import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int h = 0;
        int guest = 0;
        
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            h = Integer.parseInt(st.nextToken());
            st.nextToken();
            guest = Integer.parseInt(st.nextToken());
            
            if(guest % h != 0) { 
                System.out.println((guest % h)*100 + ((guest / h) + 1));
            }
            else { 
                System.out.println(h * 100 + (guest / h));
            }
        }
        
        
    }
}