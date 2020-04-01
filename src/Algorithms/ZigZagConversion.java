package Algorithms;

public class ZigZagConversion {

    public String convert(String s, int numRows) {

        if(s.length() == 0 || s == null) return s;
        int x = 0;
        int cur = 1;

        StringBuilder[] array = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) array[i] = new StringBuilder();
        for(Character c : s.toCharArray()){
            array[x].append(c);
            x += cur;
            if(x==0||x==numRows-1){
                cur = -cur;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int j = 0; j < array.length; j++){
            result.append(array[j]);
        }

        return result.toString();

    }

    public static void main(String[] args) {
    }

}
