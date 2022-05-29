import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String A = st.nextToken();
        String B = st.nextToken();
        
        String max = "";
        
        for(int i=2; i>=0; i--) {
            if(B.charAt(i) < A.charAt(i)) {
                max = A;
                break;
            }
            else if(B.charAt(i) > A.charAt(i)) {
                max = B;
                break;
            }
        }
        
        for(int i=2; i>=0; i--) {
            System.out.print(max.charAt(i));
        }
    }
}