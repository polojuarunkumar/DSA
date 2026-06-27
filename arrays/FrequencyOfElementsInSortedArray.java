public class FrequencyOfElementsInSortedArray {

    static void frequencyOfElementsInSortedArray(int ar[]){
        int freq=1;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] == ar[i - 1]) {
                freq++;
            } else {
                System.out.println(ar[i - 1] + " " + freq);
                freq = 1;
            }
        }

        System.out.println(ar[ar.length - 1] + " " + freq);
    }

    public static void main(String[] args) {
        int ar[]={20,20,30,30,30,30,40};
        frequencyOfElementsInSortedArray(ar);
    }
}
