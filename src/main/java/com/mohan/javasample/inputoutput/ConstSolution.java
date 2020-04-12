package com.mohan.javasample.inputoutput;

import java.util.Scanner;

/**
 * Created by s726337 on 09/01/2018.
 */
public class ConstSolution {

    static String canConstruct(int[] a) {
        // Return "Yes" or "No" denoting whether you can construct the required number.
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        if(sum%3==0)
        {
            return("Yes");
        }
        else
        {
            return("No");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = canConstruct(a);
            System.out.println(result);
        }
        in.close();
    }


//    static String canConstruct(int[] a) {
//        // Return "Yes" or "No" denoting whether you can construct the required number.
//        int ans =0;
//        for(int p : a)
//        {
//            ans+=(p%9);
//        }
//        if(ans%3==0)
//            return "Yes";
//        return "No";
//    }


}
