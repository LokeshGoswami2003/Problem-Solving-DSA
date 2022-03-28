public class Add_N_Numbers {
    public static void main(String[] args) {
        int n=10;
        int sum=add(n);
        System.out.println(sum);
    }
    static int add(int n){
        if(n==1){
            return 1;
        }
        return n + add(n-1);
    }
    
}
