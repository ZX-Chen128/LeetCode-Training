package Algorithms;

public class CountandSay {

    public String countAndSay(int n){

        if (n<=0) return "";
        String[] str = new String[n];
        str[0] = "1";
        for(int i = 1 ; i < n ; i++){
            str[i] = covert(str[i-1]);
        }

        return str[n-1];

    }

    public String covert(String str){

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else {
                sb.append(count).append(str.charAt(i));
                count = 1;
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        CountandSay c = new CountandSay();
        System.out.println(c.countAndSay(2));
    }

}
