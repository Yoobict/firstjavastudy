//샘플테스트는 통과했으나 몇몇 테스트는 잘못된값을 냈고 몇몇 테스트는 타임오벼됨
package week01.number04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //Ai와 b+i간 차이의 절댓값을 최소화하는 문제.
        // |Ai-(b+i)|식을 바꾸면 |(Ai-i)-b|.
        // b는 각 Ai-i값들의 합을 최소화 해야하므로 Ai-i값이 들어간 배열을 정렬하고 중앙값을 구한다.
        int[] totalarr = new int[n]; //Ai-i값들을 넣을 배열
        for (int i = 0; i < n; i++) {
            totalarr[i] = arr[i] - (i+1);
        }

        for(int i = 1; i < n; i++) {  // 삽입 정렬 알고리즘을 이용하여 정렬
            int value = totalarr[i];
            int prev = i-1;
            while(prev >= 0 && totalarr[prev] > value) {
                totalarr[prev+1] = totalarr[prev];
                prev--;
            }
            totalarr[prev+1] = value;
        }

        int median = totalarr[n/2]; //삽입정렬로 배열된 A-i값들의 중앙값을 찾아냄
        int total = 0;
        for(int i = 0; i < n; i++) { //|(Ai-i)-b|값을 전부 더하기. Math.abs는 절댓값을 구하는 메소드
            total = total + Math.abs(totalarr[i] - median);
        }
        System.out.println(total);

    }
}