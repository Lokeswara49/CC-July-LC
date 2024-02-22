package com.company;

import java.util.*;

public class P3 {
    static int[][] graph;
    static int N;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        parent= new int[N];
        graph = new int[N][N];
        visited = new boolean[N];
        Map<Integer, Integer> arrMap = new HashMap<>();
        Map<Integer, Integer> arrMapRev = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            arrMap.put(n, i);
            arrMapRev.put(i,n);


        }
        int E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            int e1 = sc.nextInt();
            int e2 = sc.nextInt();
            graph[arrMap.get(e1)][arrMap.get(e2)] = 1;

        }
        int src = sc.nextInt();
        int des = sc.nextInt();
        des = arrMap.get(des);
        src = arrMap.get(src);
        Arrays.fill(parent,0);
        Arrays.fill(visited,false);
        List<Integer> ans=new ArrayList<>();


        while(dfs(src,des)){
            graph[parent[des]][des]=0;
            ans.add(arrMapRev.get(parent[des]));
            Arrays.fill(parent,0);
            Arrays.fill(visited,false);
        }
        Collections.sort(ans);
        ans.forEach(a-> System.out.print(a + " "));

    }
    static boolean dfs(int src,int des){

        parent[src]=-1;
        visited[src]=true;
        boolean desFound=false;
        for(int i=0;i<N;i++){
            if(graph[src][i]==1 && i==des){
                parent[des]=src;
                return true;
            }
            else if(graph[src][i]==1 && !visited[i]){
                parent[i]=src;
                desFound=desFound || dfs(i,des);
            }
        }

        return desFound;


    }
}
