package Algorithms;

public class HappyNumber {

    public static int calculate(int n) {
        int result = 0;
        while (n > 0){
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = calculate(n);
        while(slow != fast){
            slow = calculate(slow);
            fast = calculate(calculate(fast));
        }
        return slow == 1;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.isHappy(19));
    }
}
