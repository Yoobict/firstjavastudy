package week01.number08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] grid = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = br.readLine();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        //흰칸으로 이루어진 행은 빼고 리스트에 집어넣기
        List<Integer> height = new ArrayList<>();


        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(grid[i][j] != '0'){
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
    }
}
