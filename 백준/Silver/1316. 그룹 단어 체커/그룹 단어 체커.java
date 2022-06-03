import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        int group = 0;
        
        for(int i=0; i<num; i++) {
            
            String s = br.readLine();
            cnt = s.length();
            
            for(int j=0; j<s.length(); j++) { 
                if((j < (s.length() - 2)) && (s.charAt(j) != s.charAt(j + 1))) { 
                    for(int k=j+2; k<s.length(); k++) { 
                        if(s.charAt(j) == s.charAt(k)) {
                            cnt--;
                        }
                    }
                }
            }
            if(cnt == s.length()) { 
                group++;
            }
            
        }
        System.out.println(group);
        
        
    }
}