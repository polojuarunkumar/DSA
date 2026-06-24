public class LongestAlternativeEvenOddSubArray {

    static int longestAlternativeEvenOddSubArray(int []ar){
        int count=1;
        int maxCount=1;
        for(int i=1;i<ar.length;i++){
            if(ar[i]%2==0 && ar[i-1]%2!=0 || ar[i]%2!=0 && ar[i-1]%2==0 ){
                count++;
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
//        int ar[]={8,10,13,14};
//        int ar[]={8,10,12,14};
//        int ar[]={1,5,9,11};
        int ar[]={8,10,13,14,15,16,17};
        System.out.println(longestAlternativeEvenOddSubArray(ar));
    }

}
