public class BinarySearch {

    static int binarySearch(int []ar,int key){
        int low=0;
        int high=ar.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(ar[mid]==key){
                return mid;
            }
            else if(key<ar[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar={1,4,5,6,7,8,9};
        int key=6;
        System.out.println(binarySearch(ar,key));
    }

}
