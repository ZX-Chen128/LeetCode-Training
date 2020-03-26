package Algorithms;

public class ImplementstrStr {

    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length()==0){
            return 0;
        }
        int l = needle.length();
        for (int i = 0 ; i < haystack.length()-l ; i++){
            if(haystack.substring(i,l+i)==needle){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementstrStr i = new ImplementstrStr();
        System.out.println(i.strStr("hello","ll"));
    }

}
