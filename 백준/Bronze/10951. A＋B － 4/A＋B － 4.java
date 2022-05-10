import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        
        while( (str=br.readLine()) != null){
           
            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;
            
            bw.write(A + B + "\n");
            bw.flush();
        }
        
    }
}