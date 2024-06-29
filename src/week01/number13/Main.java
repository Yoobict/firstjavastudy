package week01.number13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(ACGTfind(s));

    }
    public static int ACGTfind(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            int count = 0;

            if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') {
                count++;
                for(int j = i + 1; j < s.length(); j++) {
                    if(s.charAt(j) == 'A' || s.charAt(j) == 'C' || s.charAt(j) == 'G' || s.charAt(j) == 'T'){
                        count++;
                    }else{
                        break;
                    }
                }
            }
            if(count > total) {
                total = count;
            }
        }
        return total;
    }
}
