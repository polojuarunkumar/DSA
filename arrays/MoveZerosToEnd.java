public class MoveZerosToEnd {

    static void moveZerosToEnd(int ar[]){
        int nz=0,z=0;
        if(ar.length==0 || ar.length==0){
            return;
        }
        while(nz<ar.length){
            if(ar[nz]!=0){
                int temp=ar[nz];
                ar[nz]=ar[z];
                ar[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        int ar[]={0,1,0,3,12};
        moveZerosToEnd(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
