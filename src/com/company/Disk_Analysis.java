package com.company;

import java.util.Scanner;

public class Disk_Analysis {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int disk=sc.nextInt();
        int ans=Disk_Analysis_Function(arr,disk);
        System.out.println(ans);
    }
    static int Disk_Analysis_Function(int[] arr,int disk){
        int max=0;
        int n=arr.length;
        for(int i=0;i<n-disk+1;i++){
            int temp=findMin(arr,i,i+disk);
            max=Math.max(max,temp);
        }
        return max;
    }
    static int findMin(int[] arr,int start,int end){
        int min=Integer.MAX_VALUE;
        for(int i=start;i<end;i++){
            min=Math.min(arr[i],min);
        }
        return min;
    }

}
