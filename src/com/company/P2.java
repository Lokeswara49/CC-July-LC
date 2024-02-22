package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P2 {
    static int[][]  graph;
    static int N;
    static int[] distance;
    static boolean[] visited_vertex;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        N= sc.nextInt();
        graph = new int[N+1][N+1];
        Map<Integer,Integer> arrMap =new HashMap<>();
        for(int i=1;i<=N;i++){
            int n= sc.nextInt();

            arrMap.put(n,i);

        }
        int E= sc.nextInt();
        for(int i=0;i<E;i++){
            int e1= sc.nextInt();
            int e2= sc.nextInt();
            int w= sc.nextInt();
            graph[arrMap.get(e1)][arrMap.get(e2)] = w;


        }
        int src= sc.nextInt();
        int des= sc.nextInt();
        des=arrMap.get(des);
        src=arrMap.get(src);
        int ans=dijkstra(src,des);

        System.out.println(ans);


    }
    static int minimum() {
        int min_value = Integer.MAX_VALUE;
        int index = -1;
        for (int v = 1; v <=N; v++)
            if (!visited_vertex[v] && distance[v] < min_value) {
                min_value = distance[v];
                index = v;
            }

        return index;
    }
    static int dijkstra(int source,int destination)
    {
        visited_vertex=new boolean[N+1];
        distance = new int[1+N];

        Arrays.fill(visited_vertex,false);
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source]=0;

        if(source==destination)
            return 0;
        for (int i = 1; i < N; i++) {
            int n = minimum();
            if (n >= 1 && n <= N){
                visited_vertex[n] = true;
                if (visited_vertex[destination]) {
                    return distance[destination];
                }
                for (int j = 1; j <= N; j++) {
                    if (!visited_vertex[j] && graph[n][j] != 0 && distance[n] != Integer.MAX_VALUE && distance[n] + graph[n][j] < distance[j]) {
                        distance[j] = distance[n] + graph[n][j];
                    }
                }
            }
        }
        return distance[destination];
    }
}
