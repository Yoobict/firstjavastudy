package week01.number10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[][] grid = new int[n][2];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                grid[i-1][j] = Integer.parseInt(st.nextToken());
            }

        }
        if(costCal(grid, n, t)==-1){
            System.out.println("TLE");
        }else {
            System.out.println(costCal(grid, n, t));
        }


    }
    public static int costCal(int[][] grid, int n , int t) {
        int countCost = 0;
        for (int i = 0; i < n; i++) {
            if(t>=grid[i][1]){
                if(countCost==0){
                    countCost = grid[i][0];
                }else if(grid[i][0]!=1&&countCost>grid[i][0]){
                    countCost = grid[i][0];
                }else if(countCost<=grid[i][0]){
                    continue;
                }else{
                    return 1;
                }
            }
        }
        if(countCost==0){
            return -1;
        }

        return countCost;
    }
}
