import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int text = Integer.parseInt(br.readLine());
        String[] arr = new String[text];
        
        for(int i=0; i<text; i++) {
            arr[i] = br.readLine();
        }
        
        for(int i=0; i<text; i++) {
            
            int cnt = 0;
            int sum = 0;
            
            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    cnt++;
                } else cnt = 0;
                
                sum = sum + cnt;
            }
            System.out.println(sum);
        }
        
    }
}