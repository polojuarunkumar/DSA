public class CeilAndFloor {

    //Can be solved by using Binary Search because it is a sorted array

    static int ceil(int ar[],int key){
        int low=0;
        int high=ar.length-1;
        int mid=0;

        while(low<=high){
            mid=low+(high-low)/2;
            if(ar[mid]==key){
                return ar[mid];
            }
            else if(key<ar[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(low<ar.length){
            return ar[low];
        }
        else{
            return -1;
        }
    }

    static int floor(int ar[],int key){
        int low=0;
        int high=ar.length-1;
        int mid=0;

        while(low<=high){
            mid=low+(high-low)/2;
            if(ar[mid]==key){
                return ar[mid];
            }
            else if(key<ar[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(high>=0){
            return ar[low];
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int ar[]={2,4,5,6,7,8,9};
        System.out.println(ceil(ar,3));
        System.out.println(floor(ar,3));
    }
}
