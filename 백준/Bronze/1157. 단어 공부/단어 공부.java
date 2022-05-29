import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        String str = br.readLine();
        
        for(int i=0; i<str.length(); i++) {
            if((str.charAt(i) - 'A') > 25) {
                arr[str.charAt(i) - 'a']++;
            }
            else arr[str.charAt(i) - 'A']++;
        }
        
        int max = -1;
        char ch = '?';
        
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if(arr[i] == max) {
                ch = '?';
            }
        }
        
        System.out.print(ch);
        
        
    }
}