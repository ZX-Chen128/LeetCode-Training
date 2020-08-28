package InterviewExperience.Jingdong;

/**
 * @Author: Chen Zixin
 * @Date: 2020/8/28 4:16 下午
 */

import java.util.Scanner;

/**
 * 自从学了素数以后，小明喜欢上了数字2、3、5。当然，如果一个数字里面只出现2、3、5这三个数字，他也
 * 一样喜欢，例如222、2355、223355。
 *
 * 现在他希望你能帮他编写一个程序，快速计算出2、3、5这三个数字从小到大的第n个数，当然也包括2、3、5
 *
 * 输入描述：
 * 单组输入。
 * 每组输入数据占1行，每行输入一个正整数n。（n<=1000）
 *
 * 输出描述：
 * 每组输出数据占1行，即满足要求的第n个数
 *
 */

public class TheNthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int result = 0;
        int level = 1;
        while (index > 0){
            int target = 0;
            if(index % 3 == 1){
                target = 2;
            } else if(index % 3 == 2){
                target = 3;
            } else {
                target = 5;
            }
            result += target * level;
            level *= 10;
            index = (index - 1) / 3;
        }
        System.out.println(result);
    }
}
