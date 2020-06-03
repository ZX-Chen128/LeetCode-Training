package Algorithms.Daily.WeekTwo.PartOne;

//平安科技2020春

import java.util.Arrays;
import java.util.Scanner;

/**
 * n 个小朋友坐在一排，每个小朋友拥有 ai 个糖果，现在你要在他们之间转移糖果，使得最后所有小朋友拥有的糖果数都相同，
 * 每一次，你只能从一个小朋友身上拿走恰好两个糖果到另一个小朋友上，问最少需要移动多少次可以平分糖果，如果方案不存在输出 -1。
 *
 * 输入描述:
 *
 * 每个输入包含一个测试用例。每个测试用例的第一行包含一个整数n（1 <= n <= 100），接下来的一行包含n个整数ai（1 <= ai <= 100）。
 *
 * 输出描述:
 *
 * 输出一行表示最少需要移动多少次可以平分苹果，如果方案不存在则输出-1。
 *
 * 输入例子1:
 *
 * 4
 * 7 15 9 5
 *
 * 输出例子1:
 *
 * 3
 */

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int taregt = 0;
        int move = 0;

        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        Arrays.sort(nums);

        if(sum%num!=0){
            System.out.println(-1);
            return;
        }
        taregt = sum/num;

        int i = 0;
        int j = num - 1;

        while(i < j){
            if(nums[i] == taregt){
                i++;
            }
            if(nums[j] == taregt){
                j--;
            }
            if(nums[i] < taregt && nums[j] > taregt){
                move++;
                nums[i] += 2;
                nums[j] -= 2;
            } else if (nums[i] == taregt && nums[j] ==taregt){}
            else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(move);
    }

}
