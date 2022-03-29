public class How_Many_Zeros{
    public static void main(String[] args) {
        int n=900060;
        int times=count(n);
        System.out.println("Zero occur "+times+" times");
    }
    static int count(int number){
        return clone(number,0);
    }
    static int clone(int number,int count){
        if(number==0){
            return count;
        }
        int rem=number%10;
        if(rem==0){
            return clone(number/10, ++count);
        }
        return clone(number/10, count);
    }
}