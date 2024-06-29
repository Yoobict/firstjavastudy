package week01.number09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arrx = new int[n];
        int[] arry = new int[m];
        for (int i = 0; i < n; i++) {
            arrx[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arry[i] = Integer.parseInt(st.nextToken());
        }
        if(wartest(arrx, arry, x, y)) {
            System.out.println("No war");
        }else{
            System.out.println("War");
        }
    }
    public static boolean wartest(int[] arrx, int[] arry, int x, int y) {
        boolean result = false;
        Arrays.sort(arrx);
        Arrays.sort(arry);
        for(int i = x; i <= y;i++){
            if(arrx[arrx.length-1] < i && arry[0] >= i){
                result = true;
                break;
            }
        }
        return result;
    }
}
