public class Multiply_Digits {
    public static void main(String[] args) {
        int n=22353;
        int mulval=mul(n);
        System.out.println(mulval);
    }
    static int mul(int n){
        if(n==0)
        {
            return 1;
        }
        return n%10 * mul(n/10);
    }
    
}
