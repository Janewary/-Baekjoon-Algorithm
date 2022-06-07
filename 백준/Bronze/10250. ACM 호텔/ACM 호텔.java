import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int h = 0;
        int w = 0;
        int guest = 0;
        
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            guest = Integer.parseInt(st.nextToken());
            
            int floor = 0;
            int room = 0;
            
            if(guest % h != 0) { 
            floor = guest % h;
            room = (guest / h) + 1;
            }
            else { 
                floor = h;
                room = guest / h;
            }
            
            if(room < 10) { 
                System.out.println(floor + "0" + room);
            }
            else { 
                System.out.print(floor);
                System.out.println(room);
            }
        }
        
        
        
        
    }
}