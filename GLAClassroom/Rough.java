public class Rough{
   public static void sum1(int i,int n,int sum){
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        i++;
        sum1(i,n,sum);

    }
    public static void main(String[] args) {
        sum1(0,5,0);
    }
}