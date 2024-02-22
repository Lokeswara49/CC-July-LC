package com.company;

import java.util.Scanner;

public class MINNOTES {

    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);

            int t= sc.nextInt();
            while(t-->0) {
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }
                int ans = gcd(a, -1);
                for (int i = 0; i < N; i++) {
                    int temp = a[i];
                    if (i == N-1) {
                        a[i] = a[i - 1];
                        ans = Math.min(gcd(a, i), ans);

                    } else {
                        a[i] = a[i + 1];
                        ans = Math.min(ans, gcd(a, i));
                    }
                    a[i] = temp;
                }
                System.out.println(ans);
            }
        }
        catch (Exception e){
            return;
        }
    }
    static int gcd(int[] arr,int x){
        int j=1;
        int n=arr.length;
        int gcd=arr[0];
        for(int i=1;i<n;i++){
            gcd=gcd2(gcd,arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(i!=x){
                ans+=(arr[i]/gcd);
            }
        }
        return ans+1;


    }
    static int gcd2(int n1,int n2){
        int temp;
        while (n2 > 0) {
            temp = n2;
            n2 = n1% n2;
            n1 = temp;
        }
        return n1;
    }
}
