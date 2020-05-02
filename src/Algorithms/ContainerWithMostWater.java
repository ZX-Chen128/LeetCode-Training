package Algorithms;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 *
 */

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int target = 0;
        while(i != j){
            if(height[i]>height[j]){
                if(height[j]*(j-i)>target){
                    target = height[j]*(j-i);
                }
                j--;
            } else {
                if(height[i]*(j-i)>target){
                    target = height[i]*(j-i);
                }
                i++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
