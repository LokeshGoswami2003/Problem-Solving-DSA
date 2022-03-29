public class Reverse {
    public static void main(String[] args) {
        int n=198345;
        int rev=reverse(n);
        System.out.println(rev);
    }
    static int reverse(int n){
        if(n%10==n){
            return n; 
        }
        return (n%10)* (int)Math.pow(10,(int)(Math.log10(n))) + reverse(n/10);
    }
}
