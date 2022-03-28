// 6.       *
//         **
//        ***
//       ****
//      *****


public class Pattern_6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i<n-j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
