package test;

import java.util.Scanner;

public class Fibonacci {

    public int[] fibonacci (int n){
        int[] fib = new int[n];
        for(int i = 0 ; i < n ; i++){
            fib[i] = count(i);
        }

        return fib;
    }

    public int count(int i){
        if(i == 0){
            return 1;
        } else if(i == 1){
            return 2;
        } else {
            return count(i-1)+count((i-2));
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = f.fibonacci(n);
        for(int i = 0 ; i < n; i++){
            System.out.println(x[i]);
        }
    }
}
