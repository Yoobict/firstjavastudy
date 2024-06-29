//테스트 마지막 3개 타임리미트
package week01.number14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n*3];
        for (int i = 0; i < n*3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /*for(int i = 1; i < n*3; i++) {
            int value = arr[i];
            int prev = i-1;
            while(prev >= 0&&arr[prev] > value) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = value;
        }*/
        Arrays.sort(arr);

        BigInteger bignumber = new BigInteger("0");
        for(int i = arr.length-2; i >= n; i-=2) {
            BigInteger num = BigInteger.valueOf(arr[i]);
            bignumber = bignumber.add(num);
        }
        System.out.println(bignumber);
    }
}
