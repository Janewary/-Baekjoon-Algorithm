import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int test_case = Integer.parseInt(br.readLine());
        
        for(int i=0; i<test_case; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            double[] arr = new double[N];
            double avg = 0;
            double over = 0;
                
            for(int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                avg = avg + arr[j];
            }
            avg = avg / (double)N;
            
            for(int k=0; k<N; k++) {
                if(arr[k] > avg) {
                    over++;
                }
            }
            double ratio = (over/(double)N) * 100;
            System.out.println(String.format("%.3f", ratio) + "%");
            avg = 0;
            over = 0;
        }
     
    }
}