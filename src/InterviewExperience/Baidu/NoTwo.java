package InterviewExperience.Baidu;

import java.util.Scanner;

public class NoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        for (int i = 0; i < time; i++) {
            int nums = sc.nextInt();
            int turns = sc.nextInt();
            int[] array = new int[nums];

            int count = 0;
            int[] answer = new int[nums];
            int index = 0;

            for (int j = 0; j < turns; j++) {
                int groups = sc.nextInt();
                for (int k = 0; k < groups; k++) {
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    for (int l = left; l <= right; l++) {
                        if(++array[l-1] == turns){
                            count++;
                            answer[index++] = l;
                        }
                    }
                }
            }
            System.out.println(count);
            for (int j = 0; j < count; j++) {
                if(j != count - 1) {
                    System.out.print(answer[j] + " ");
                } else{
                    System.out.println(answer[j]);
                }
            }

        }
    }
}
