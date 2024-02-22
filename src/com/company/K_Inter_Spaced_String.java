package com.company;

import java.util.Scanner;

public class K_Inter_Spaced_String {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int k= sc.nextInt();
        String ans=K_Inter_Spaced_String_Functon(s,k);
        System.out.println(ans);

    }
    static String K_Inter_Spaced_String_Functon(String s,int k){
        String ans="";
        String temp="";
        for(int i=0;i<s.length()-1;i++){
            if(i==s.length()-2 && Math.abs((int)s.charAt(i)-(int)s.charAt(i+1))<=k){
                temp+=s.charAt(i);
                temp+=s.charAt(i+1);
            }
            else if(Math.abs((int)s.charAt(i)-(int)s.charAt(i+1))<=k){
                temp+=s.charAt(i);
            }
            else{
                temp+=s.charAt(i);
                if(temp.length()>ans.length()){
                    ans=temp;
                }
                temp="";
            }
        }
        if(temp.length()>ans.length())
            ans=temp;
        return ans;
    }
}
