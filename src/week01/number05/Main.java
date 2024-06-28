package week01.number05;

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
        //요소 2개의 차이의 절대값 중 최댓값을 구하는 문제
        //요소를 오름차순으로 정렬하고 앞에 있는 수(최소값)과 뒤에 있는 수(최대값)의 차를 절댓값메소드로 출력한다.
        for(int i=1;i<n;i++){ //삽입정렬
            int value = arr[i];
            int prev = i-1;
            while(prev>=0&&arr[prev]>value){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = value;
        }
        System.out.println(Math.abs(arr[n-1]-arr[0]));
    }
}
