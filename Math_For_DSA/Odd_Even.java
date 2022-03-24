public class Odd_Even{
    public static void main(String[] args) {
        int a=88;
        if(isodd(a))
            System.out.println("No. is odd");
        if(iseven(a))
            System.out.println("No. is even");
           
    }
    static boolean isodd(int a){
        return (a&1)==1;
    }
    static boolean iseven(int a){      // No need to add this function We Is not odd then even
        return (a&1)==0;
    }
}