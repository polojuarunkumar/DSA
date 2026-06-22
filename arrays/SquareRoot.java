public class SquareRoot {

    static int sqrt(int n){
        if(n==1 || n==0){
            return n;
        }
        int low=2;
        int high=n/2;
        int mid=0;
        int res=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                low=mid+1;
                res=mid;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(25));
        System.out.println(sqrt(24));
    }
}
