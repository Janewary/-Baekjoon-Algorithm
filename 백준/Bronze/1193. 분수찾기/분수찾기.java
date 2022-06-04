import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        
        int cross_count = 1, prev_count_sum = 0;
        
        while(true) { 
            if(x <= prev_count_sum + cross_count) { 
                if(cross_count % 2 == 1) { 
                    System.out.println((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
                    break;
                }
                else { 
                    System.out.println((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
                    break;
                }
            }
            
            else { 
                prev_count_sum = prev_count_sum + cross_count;
                cross_count++;
                    
            }
            
        }
        
    }
}