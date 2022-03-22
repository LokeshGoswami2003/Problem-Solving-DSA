public class Fibonacci_Recursion {
    public static void main(String[] args) {
        int ans=fibo(10);
        System.out.println(ans);
    }   
    static int fibo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
