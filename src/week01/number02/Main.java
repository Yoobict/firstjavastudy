package week01.number02;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //문자열의 갯수
        int l = Integer.parseInt(st.nextToken()); //문자열의 길이
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(s[j-1].compareTo(s[j])>0){
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                }
            }
        }
        StringBuilder total = new StringBuilder();
        for(int i = 0; i<n; i++){
            total.append(s[i]);
        }
        System.out.println(total);
    }
} //버블정렬
