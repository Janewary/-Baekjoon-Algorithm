import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), "X");
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                int length = str.length();
                for(int j=1; j<length+1; j++){
                    sum = sum + j;
                }
            }
            System.out.println(sum);
            sum = 0;
            
        }
    }
}