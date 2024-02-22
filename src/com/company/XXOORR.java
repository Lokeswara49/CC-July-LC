package com.company;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;


abstract class XXOORR {
    public static void main(String[] args) {
//        try{
//            Scanner sc=new Scanner(System.in);
//            int t = sc.nextInt();
//            while (t-- > 0) {
//                int N = sc.nextInt();
//                int K = sc.nextInt();
//                int[] arr = new int[N];
//                for (int i = 0; i < N; i++) {
//                    arr[i] = sc.nextInt();
//                }
//                int maxBits=MaxBits(arr);
//                int[] ansArr=new int[maxBits];
//                int div=2;
//                int index=maxBits-1;
//                while(index>=0) {
//                    for (int i = 0; i < N; i++) {
//
//                        if (arr[i]>div && arr[i] % div != 0) {
//                            ansArr[index]++;
//                        }
//
//                    }
//                    div++;
//                    index--;
//                }
//                long ans=0;
//                for(int i=0;i<maxBits;i++){
//                    ans+=ansArr[i];
//                }
//                System.out.println(ans);
//            }
//        }
//        catch (Exception e){
//            return;
//        }
//       Scanner sc=new Scanner(System.in);
//       int n= sc.nextInt();
//       int space=n;
//       for(int i=0;i<n;i++){
//           int j=1;
//           int num=1;
//           while (j<space){
//               System.out.print(" "+"\t");
//               j++;
//           }
//           while(j<=n){
//               System.out.print(num+"\t");
//               num++;
//               j++;
//           }
//           int x=n-space;
//           num-=2;
//           j=0;
//           while(j<x){
//               System.out.print(num+"\t");
//               j++;
//               num--;
//           }
//           space--;
//           System.out.println("");
//       }







    }
    static int MaxBits(int[] arr){
        int maxEle=0;
        for(int i=0;i<arr.length;i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }
        int ans=0;
        int p=1;
        while(p<maxEle){
            p*=2;
            ans++;
        }
        return ans;
    }
}
class B extends XXOORR{
        int m1(){
            return 10;
    }
}