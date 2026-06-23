public class SlidingWindow {

    static int maxSumSubArray(int ar[],int k){
        int maxSum = Integer.MIN_VALUE;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum=windowSum+ar[i];
        }
        for(int i=k;i<ar.length;i++){
            windowSum=windowSum-ar[i-k]+ar[i];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int ar[]={2,9,31,-4,21,7};
        int k=4;
        System.out.println(maxSumSubArray(ar,k));
    }
}
