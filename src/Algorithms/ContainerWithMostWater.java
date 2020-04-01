package Algorithms;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int result=0;
        int i = 0;
        int j = height.length-1;
        while(i != j){
            if(height[i] >= height[j]){
                if(height[j]*(j-i) > result){
                    result = height[j]*(j-i);
                }
                j--;
            } else {
                if(height[i]*(j-i) > result){
                    result = height[j]*(j-i);
                }
                i++;
            }
        }

        return result;

    }

}
