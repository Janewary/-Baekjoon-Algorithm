import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
    
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = (br.readLine()).split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(int i=0; i<arr.length; i++){
            if(min > Integer.parseInt(arr[i])){
                min = Integer.parseInt(arr[i]);
            } else if(max < Integer.parseInt(arr[i])){
                max = Integer.parseInt(arr[i]);
            }
        }
        System.out.println(min + " " + max);
    }
}