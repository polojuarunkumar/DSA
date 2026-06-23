public class InverseOfArray {

    static int[] inverseOfArray(int []ar){
        int b[]=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            int value=ar[i];
            b[value]=i;
        }
        return b;
    }


    public static void main(String[] args) {
        int a[]={2,3,1,0,4};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int b[]=inverseOfArray(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
