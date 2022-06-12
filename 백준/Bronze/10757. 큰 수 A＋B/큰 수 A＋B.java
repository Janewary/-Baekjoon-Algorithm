import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String str_A = st.nextToken();
        String str_B = st.nextToken();
        
        int max_length = Math.max(str_A.length(), str_B.length());
        int[] A = new int[max_length + 1];
        int[] B = new int[max_length + 1];
        
        int idx = 0;
        
		for(int i = str_A.length() - 1; i >= 0; i--) { 
            A[idx] = str_A.charAt(i) - '0';
            idx++;
        }
        
        idx = 0;
        
        for(int i = str_B.length() - 1; i >= 0; i--) { 
            B[idx] = str_B.charAt(i) - '0';
            idx++;
        }
        
        for(int i = 0; i < max_length; i++) { 
            int value = A[i] + B[i];
            A[i] = value % 10;
            A[i + 1] = A[i + 1] + (value / 10);
        }
        
        if(A[max_length] != 0) {
            System.out.print(A[max_length]);
        }
        for(int i = A.length - 2; i >= 0; i--) { 
            System.out.print(A[i]);
        }

        
    }
}