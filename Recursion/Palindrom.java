public class Palindrom {
    public static void main(String[] args) {
        int n=11;
        boolean pal=ispalindrom(n);
        System.out.println(pal);
    }
    static int reverse(int n){
        if(n%10==n){
            return n; 
        }
        return (n%10)* (int)Math.pow(10,(int)(Math.log10(n))) + reverse(n/10);
    }
    static boolean ispalindrom(int n){
        return n==reverse(n);
    }
}
