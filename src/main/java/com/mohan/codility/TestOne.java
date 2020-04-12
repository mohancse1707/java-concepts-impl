package com.mohan.codility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestOne {

    public static void main(String args[]){


        int[] one = {2,4,1,6,5,9,7};
        System.out.println(solution(one));

        int[] two = {4,3,2,6,1};
        System.out.println(solution(two));

        int[] three = {2,1,6,4,3,7};
        System.out.println(solution(three));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Integer[] integerArray = Arrays.stream( A ).boxed().toArray( Integer[]::new );
        List<Integer[]> splittedIntegerArrayList = new ArrayList<>();

        int splitValue = integerArray.length / A[0];
        int copyFrom=0;
        int lengthCount=0;
        int temp = splitValue;


        if(splitValue > 1){
            for (int i = 0; i < splitValue; i++)
            {
                if(temp > integerArray.length){
                    temp = integerArray.length;
                }
                splittedIntegerArrayList.add(Arrays.copyOfRange(integerArray, copyFrom, temp));
                lengthCount += temp;
                copyFrom = temp;
                temp = temp+2;
            }
            //Converting List of Array into Array
            Integer[] resultArray =
                    splittedIntegerArrayList.stream().flatMap(Arrays::stream).toArray(Integer[]::new);
            Arrays.sort(resultArray);
            System.out.println(Arrays.toString(resultArray));
        } else {
            Arrays.sort(integerArray);
            System.out.println(Arrays.toString(integerArray));
        }
        return splitValue;
    }
}
