import javax.swing.text.html.HTMLDocument.BlockElement;

public class Prime_In_range{
    public static void main(String[] args) {
        int range=50;
        boolean[] primes=new boolean[range+1];
        sieve(primes);
    }
    static void sieve(int range, boolean[] primes){
        for(int i=2;i*i<=range;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j=j+i){
                    primes[j]=true;
                }
            }
        }
    } 
    static void print(boolean[] primes){
        
    }
}

