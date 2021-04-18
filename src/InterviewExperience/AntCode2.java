package InterviewExperience;

import java.util.Arrays;
import java.util.Scanner;

public class AntCode2 {

    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int castleNum = sc.nextInt();
        int time = sc.nextInt();

        int[] yummy = new int[castleNum];
        for (int i = 0; i < castleNum; i++) {
            yummy[i] = sc.nextInt();
        }

        max = yummy[0];

        // 第一个小难点，多维数组
        int[][] road = new int[castleNum][castleNum];

        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j < road.length; j++) {
                road[i][j] = -1;
            }
        }

        for (int i = 0; i < castleNum - 1; i++) {
            int c1 = sc.nextInt() - 1;
            int c2 = sc.nextInt() - 1;
            int value = sc.nextInt();
            road[c1][c2] = value;
            road[c2][c1] = value;
        }

//        //图的问题，深度优先解决
//        for (int i = 1; i < road.length; i++) {
//            dfs(yummy, road, time - road[0][i], i, yummy[0]);
//        }

        System.out.println(max);
    }

    public static void dfs(int[] yummy, int[][] road, int time, int position, int currentYummy) {
        if (time < 0) return;

        if (position == 0) {
            max = Math.max(currentYummy, max);
            return;
        }

        for (int i = 0; i < road.length; i++) {
            if(road[position][i] != -1) {
                dfs(yummy, road, time - road[position][i], i, currentYummy + yummy[position]);
            }
        }
    }

}
