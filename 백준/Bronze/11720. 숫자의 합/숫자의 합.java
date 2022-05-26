import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        
        int sum = 0;
        
        for(int i=0; i<num.length(); i++) {
            sum = sum + (num.charAt(i) - 48);
        }
        
        System.out.println(sum);
    }
}