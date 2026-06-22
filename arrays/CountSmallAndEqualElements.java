public class CountSmallAndEqualElements {

    static int countSmallAndEqualElements(int []ar,int key) {
        int low = 0;
        int high = ar.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (ar[mid] == key) {

                //If duplicates found
                while(mid+1<ar.length && ar[mid+1]==key){
                    mid++;
                }
                break;
            } else if (key < ar[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        //If no element exist
        if(ar[mid]>key){
            return mid;
        }
        else{   //without duplicates
            return mid+1;
        }

    }
    public static void main(String[] args) {
        int[] ar={1,4,5,6,7,8,8,9};
        int key=8;
        System.out.println(countSmallAndEqualElements(ar,key));
    }
}
