package week01.number03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //아이의 인원 수이자 번호
        int x = Integer.parseInt(st.nextToken()); //과자 개수
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { //각 아이들의 번호이자 원하는 과자 개수
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //최대한 많은 아이가 만족하려면 과자를 적게 원하는 아이부터 나눠야한다.
        //그러므로 오름차순으로 번호를 정렬.
        //삽입 정렬 알고리즘을 이용
        for (int i = 1; i < n; i++) {
            int prev = i-1;
            int value = arr[i];
            while(prev >= 0 && arr[prev] > value){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = value;
        }
        //총 과자의 개수 에서 오름차순으로 정렬한 번호(원하는 과자의 개수)를 빼면서 만족한 아이의 수를 증가
        //과자의 개수가 마이너스가 되면 종료하고 출력
        int count = 0; // 만족한 아이의 수
        int index = 0;

        while (index < n && x >= arr[index]) {
            x -= arr[index];
            index++;
            count++;
        }
        //과자의 갯수가 남았는데 아이들에게 디 나눠줬다면 마지막 아이는 만족하지 못하므로 인원수에서 뺌
        if (x > 0 && count == n) {
            count--;
        }
        System.out.println(count);
    }
}
