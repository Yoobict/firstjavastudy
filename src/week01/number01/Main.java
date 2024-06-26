package week01.number01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //막대의  총 갯수
        int k = Integer.parseInt(st.nextToken()); //선택하는 막대의 갯수
        st = new StringTokenizer(br.readLine()); //줄바꿈 후 입력받기
        int[] l = new int[n]; //각 막대의 길이
        for(int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(l); //막대를 길이 오름차순으로 정렬
        int total = 0; //선택된 막대의 총 길이
        for(int i = l.length-1; i>=n-k;i--){ //오름차순으로 정렬했으니 뒤에서부터 정해진 갯수만큼 가져와서 합치기
            total += l[i];
        }
        System.out.println(total);

    }
}
