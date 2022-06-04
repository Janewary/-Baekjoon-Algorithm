import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        
        int i = 1;
        int cnt = 0;
        
        while(cnt < x) { 
            cnt = cnt + i;
            i++;
        }
        i = i - 1;
        
        cnt = 0;
        
        for(int j = 1; j < i; j++) { 
            cnt = cnt + j;
        }
        
        int index = x - cnt - 1;
        
        int[] up = new int[i];
        int[] down = new int[i];
        
        if((i % 2) == 0) { 
            
            for(int j = 0; j < i; j++) { 
                up[j] = j + 1;
                down[j] = i - j;
            }
            System.out.println(up[index] + "/" + down[index]);
        }
        else { 
            for(int j = 0; j < i; j++) { 
                up[j] = i - j;
                down[j] = j + 1;
            }
            System.out.println(up[index] + "/" + down[index]);
        }
        
    }
}