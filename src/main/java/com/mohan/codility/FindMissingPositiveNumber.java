package com.mohan.codility;

/*
This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
*/

import java.util.Arrays;

public class FindMissingPositiveNumber {

    public static void main(String args[]){

         int[] A = {1, 3, 6, 4, 1, 2};

//        int[] A = {1, 2, 3};
//
//        int[] A = {-1,-3};

        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        int N = A.length;

        int minimumValue = 1;

        if(N > 0 && N <= 100000){

            for(int element=0; element < N; element++){

                if(A[element] == minimumValue){
                    minimumValue++;
                }

                if(A[element] > minimumValue){
                   return minimumValue;
                }
            }

        }
        return minimumValue;
    }
}
