package com.mohan.codility;



import java.util.Arrays;


public class TestTwo {

    public static void main(String args[]){
        System.out.println(solution(1,8,3,2,6,4));
        System.out.println(solution(0,0,0,7,8,9));
        System.out.println(solution(2,4,5,9,5,9));
        System.out.println(solution(6,1,4,9,5,9));
        System.out.println(solution(6,1,4,9,5,9));
    }
    public static String solution(int A, int B, int C, int D, int E, int F) {

        int[] digits = {A, B, C, D, E, F};
        String invalidTime="NOT POSSIBLE";
        Arrays.sort(digits);
        if (digits[4] < 6) { //1 2 3 4 6 8
            if (10 * digits[0] + digits[1] < 24)
                return "" + digits[0] + digits[1] + ":" + digits[2] + digits[3] + ":" + digits[4] + digits[5];
            else
                return invalidTime;
        } else if (digits[3] < 6) {
            if (10 * digits[0] + digits[1] < 24)
                return "" + digits[0] + digits[1] + ":" + digits[2] + digits[4] + ":" + digits[3] + digits[5];
            else
                return invalidTime;
        } else if (digits[2] < 6) {
            if (10 * digits[0] + digits[3] < 24)
                return "" + digits[0] + digits[3] + ":" + digits[1] + digits[4] + ":" + digits[2] + digits[5];
            else
                return invalidTime;
        } else {
            return invalidTime;
        }
    }
}

