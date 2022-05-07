import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=T; i++) {
            String str = br.readLine();
            int sum = (str.charAt(0)-'0')+(str.charAt(2)-'0');
            bw.write("Case #" + i + ": " + sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}