import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];
        
        for(int i=0; i<str.length(); i++) {
            if((str.charAt(i) - 'A') > 25) {
                arr[i] = str.charAt(i) - 'a';
            }
            else arr[i] = str.charAt(i) - 'A';
        }
        
        int[] cnt = new int[26];
        
        for(int i=0; i<arr.length; i++) {
            cnt[arr[i]]++;
        }
        
        int max = 0;
        int index = 0;
        
        for(int i=0; i<cnt.length; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
                index = i;
            }
        }
        
        int count = 0;
        
        for(int i=0; i<cnt.length; i++) {
            if(max == cnt[i]) {
                count++;
            }
        }
        
        if(count > 1) {
            System.out.println("?");
        }
        else {
            System.out.println((char)(index + 65));
        }
        
        
    }
}