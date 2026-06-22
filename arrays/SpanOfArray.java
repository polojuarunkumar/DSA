public class SpanOfArray {

    //Span Of Array = max - min
    static int spanOfArray(int ar[]){
        int max=ar[0];
        int min=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
        int ar[]={52,41,61,78,15,42,67};
        System.out.println(spanOfArray(ar));
    }
}
