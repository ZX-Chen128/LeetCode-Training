package InterviewExperience.Jingdong;

/**
 * @Author: Chen Zixin
 * @Date: 2020/8/28 4:27 下午
 */


import java.util.Scanner;

/**
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 *
 * 题目描述：
 * 某滚球游戏规则如下：球从入口处（第一层）开始向下滚动，每次可向下滚动一层，直到滚至最下面一
 * 层为止。球每次可滚至左下、下方或右下三个方格中的任意一个，每个方格都有一个得分，如下图所示。
 * 第1层有1个方格，第2层有3个方格，……，以此类推，第n层有2*n-1个方格。设计一个算法，使得球从
 * 入口滚至最下面一层的总得分和最大。
 *
 * 输入描述
 * 第1行的正整数n表示数字三角形的层数。（n<=100)
 *
 * 接下来n行包含一个数字三角形，每一行包含2n-1个方格，对应有2n-1个表示得分的正整数（不超过10^5），每两个数字之间用空格隔开。
 *
 * 输出描述
 * 球从入口（第一层）滚至最下面一层的最大得分和。
 *
 * 样例输入
 * 3
 * 1
 * 2 1 2
 * 3 4 2 1 3
 *
 * 样例输出
 * 7
 *
 */
public class RollingBallGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = 2 * row - 1;
        int[][] matrix = new int[row][col];
        int beginRow = 0;    //起始行
        int beginCol = row - 1;    //每行的起始列
        sc.nextLine();    //从下一行开始
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(" ");
            int c = beginCol;
            for (String num : line) {
                if (!("".equals(num))) {    //过滤空格
                    matrix[beginRow][c] = Integer.parseInt(num);
                    c++;
                }
            }
            beginRow++;
            beginCol--;
        }

        //从下往上加
        for (int i = row - 2; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] += Math.max(matrix[i + 1][j - 1], Math.max(matrix[i + 1][j], matrix[i + 1][j + 1]));   //每个位置的元素为当前值+左下、下、右下的最大值
                }
            }
        }

        System.out.println(matrix[0][row - 1]); //结果为第一行的元素
    }
}
