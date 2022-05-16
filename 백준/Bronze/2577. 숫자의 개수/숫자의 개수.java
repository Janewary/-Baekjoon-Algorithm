import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        String str = Integer.toString(num);
        int[] arr = new int[10];
        
        for(int i=0; i<10; i++){
            for(int j=0; j<str.length(); j++){
                if((str.charAt(j) - 48) == i){
                    arr[i] = arr[i] + 1;
                }
            }
            System.out.println(arr[i]);
        }
        
        
    }
}