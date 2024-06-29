package week01.number07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i = 1; i <= n; i+=2) { //1이상 n의 홀수인 정수 중 약수가 8개인 정수 개수를 구하는 반복문
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j == 0){
                    count += 1;
                }
            }
            if(count == 8){
                total += 1;
            }
        }
        System.out.println(total);
    }
}
