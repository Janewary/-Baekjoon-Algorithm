import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int H1 = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        
        if(M1 < 45){
            int M2 = 60-(45-M1);
            if(H1 == 0) System.out.printf("23 %d", M2);
            else {
                int H2 = H1 - 1;
                System.out.printf("%d %d", H2, M2);
            }
        } else {
            int M2 = M1 - 45;
            System.out.printf("%d %d", H1, M2);
        }
    }
}