public class SecondLargest {

    static int secondLargest(int ar[]) {
        int max1 = 0, max2 = 0;
        if (ar[0] > ar[1]) {
            max1 = ar[0];
            max2 = ar[1];
        } else {
            max2 = ar[0];
            max1 = ar[1];
        }
        for (int i = 2; i < ar.length; i++) {
            if (ar[i] > max1) {
                max2 = max1;
                max1 = ar[i];
            } else if (ar[i] > max2) {
                max2 = ar[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int ar[]={41,58,72,63,14,75};
        System.out.println(secondLargest(ar));
    }
}
