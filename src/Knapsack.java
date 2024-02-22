public class Knapsack {
    public static void main(String[] args) {
        int t=7;
        int n=3;
        int[]times={3,4,2};
        int []val={4,6,5};
        System.out.println(knapsackTimer(t,n,times,val));
    }
    public static int knapsackTimer(int T,int N,int[]times,int []val){
        if(T==0||N==0){
            return 0;
        }
        else if(times[N-1]<=T){
            return max(knapsackTimer(T-times[N-1],N-1,times,val)+val[N-1],knapsackTimer(T,N-1,times,val)) ;
        }
        else{
            return knapsackTimer(T,N-1,times,val);
        }
    }

    public static int max(int x, int y) {
        if(x>y){
            return x;
        }
        return y;
    }
}
