package Algorithms.JianzhiOffer;

/*
    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
    每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
    整数，判断数组中是否含有该整数。
 */

/*
    从右上角开始比较，一直大的往下，小的往左
 */

public class JZ1 {
    public static boolean Find(int target, int [][] array) {
        int height = array.length;
        if(height == 0) {
            return false;
        }
        int length = array[0].length;
        if(length == 0) {
            return false;
        }
        if(target < array[0][0])
            return false;
        int row = 0;
        int col = length - 1;
        while(row < height && col >= 0){
            if(target == array[row][col]){
                return true;
            }
            else if(target < array[row][col]){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(JZ1.Find(4,a));
    }

}
