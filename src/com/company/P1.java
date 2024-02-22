package com.company;

import java.util.*;

public class P1 {
   static  Map<Integer,List<Integer>> graph = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        for(int i=0;i<N;i++){

            int n= sc.nextInt();
            graph.put(n, new ArrayList<>());
            visited.put(n,false);

        }
        int E= sc.nextInt();
        for(int i=0;i<E;i++){

            int e1= sc.nextInt();;
            int e2= sc.nextInt();
            List<Integer> a=graph.get(e1);
            a.add(e2);
            graph.replace(e1,a);

        }
        int source = sc.nextInt();
        int destination = sc.nextInt();

        if(dfs(source,destination)){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    static boolean dfs(int src,int des){
        boolean desFound = false;
        visited.replace(src,true);
        List<Integer> a = graph.get(src);

        for(int i=0;i<a.size();i++){
            if(a.get(i) == des){
                return true;
            }
            else if(!visited.get(a.get(i))){
                desFound = desFound || dfs(a.get(i) , des);
            }
        }
        return desFound;

    }
}
