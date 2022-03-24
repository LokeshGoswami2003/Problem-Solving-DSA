public class Insertion_Sort{
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2};
        Insertion ss=new Insertion();
        int[] na=ss.sort(arr);
        ss.print(na);
    }
}

class Insertion{
    public int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int k=i;
            for(int j=i-1;j>=0;j--){
                if(arr[k]>=arr[j]){
                    break;
                }
                if(arr[k]<arr[j]){
                    
                    swap(arr,k,j);
                    k--;
                }
            }
        }
        return arr;
    }

    public  void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public void print(int[] arr){
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }

}