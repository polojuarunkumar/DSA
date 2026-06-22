public class ReverseArray {

    static void reverse(int []ar){
        int i=0;
        int j=ar.length-1;
        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int ar[]={4,8,6,2,3,1};
        reverse(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
