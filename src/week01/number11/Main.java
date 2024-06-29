package week01.number11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[]arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(canAngle(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean canAngle(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int prev = i-1;
            while(prev>=0&&arr[prev]>value){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = value;
        }
        int total = 0;
        for(int i = arr.length-2; i >= 0; i--){
            total = total + arr[i];
        }
        return total > arr[arr.length - 1];

    }
}
