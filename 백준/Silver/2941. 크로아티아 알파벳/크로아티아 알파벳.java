import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int len = s.length();
        int cnt = s.length();
        
        for(int i=0; i<len; i++) {
            
            char ch = s.charAt(i);
            
            if(ch == 'c' && i < len - 1) {
                if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                    cnt--;
                    i++;
                }
            }
            else if(ch == 'd' && i < len - 1) {
                if(s.charAt(i+1) == '-') {
                    cnt--;
                    i++;
                }
                else if((s.charAt(i+1) == 'z') && i < len - 2) {
                    if(s.charAt(i+2) == '='){
                        cnt = cnt - 2;
                        i = i + 2;
                    }
                }
                
            }
            else if((ch == 'l' || ch == 'n') && i < len - 1) {
                if(s.charAt(i+1) == 'j') {
                    cnt--;
                    i++;
                }
            }
            else if((ch == 's' || ch == 'z') && i < len - 1) {
                if(s.charAt(i+1) == '=') {
                    cnt--;
                    i++;
                }
            }
        }
        System.out.println(cnt);
    }
}