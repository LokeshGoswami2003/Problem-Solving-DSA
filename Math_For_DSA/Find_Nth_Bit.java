public class Find_Nth_Bit {
    public static void main(String[] args) {  //1 1 1 1 0
        boolean bit=value(10, 3);
        if(bit){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

    static boolean value(int number,int findbit){
        number=number>>findbit-1;
        if((number&1)==1){
            return true;
        }
        return false;
    } 
}
