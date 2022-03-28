public class Add_Digits {
    public static void main(String[] args) {
        int n=22353;
        int addval=add(n);
        System.out.println(addval);
    }
    static int add(int n){
        if(n==0)
        {
            return 0;
        }
        return n%10 + add(n/10);
    }
    
}
