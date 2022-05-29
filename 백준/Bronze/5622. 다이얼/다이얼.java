import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int time = 0;
        
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >=65 && str.charAt(i)<=67) {
                time = time + 3;
            }
            else if(str.charAt(i) >=68 && str.charAt(i)<=70) {
                time = time + 4;
            }
            else if(str.charAt(i) >=71 && str.charAt(i)<=73) {
                time = time + 5;
            }
            else if(str.charAt(i) >=74 && str.charAt(i)<=76) {
                time = time + 6;
            }
            else if(str.charAt(i) >=77 && str.charAt(i)<=79) {
                time = time + 7;
            }
            else if(str.charAt(i) >=80 && str.charAt(i)<=83) {
                time = time + 8;
            }
            else if(str.charAt(i) >=84 && str.charAt(i)<=86) {
                time = time + 9;
            }
            else if(str.charAt(i) >=87 && str.charAt(i)<=90) {
                time = time + 10;
            }
        }
        
        System.out.println(time);
        
    }
}