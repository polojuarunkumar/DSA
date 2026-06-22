public class RotateArrayByKTimes {

    static void reverse(int []ar,int start,int end){
        while(start<end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }

    static void rotateArrayByKTimes(int []ar,int k){
        k=k%ar.length;
        if(k<0){
            k=k+ar.length;
        }

        reverse(ar,0,k-1);
        reverse(ar,k,ar.length-1);
        reverse(ar,0,ar.length-1);
    }

    public static void main(String args[]){
        int []ar={1,2,3,4,5};
        int k=3;
        rotateArrayByKTimes(ar,k);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
