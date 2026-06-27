public class ReversingColumnsOfMatrix {

    static void reverseCols(int ar[][]){
        for(int i=0;i<ar.length;i++){
            int left=0;
            int right=ar.length-1;
            while(left<right){
                int temp=ar[i][left];
                ar[i][left]=ar[i][right];
                ar[i][right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
//        int ar[][]={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };

        int ar[][]={
                {10,20,30,40,50},
                {60,70,80,90,100},
                {110,120,130,140,150},
                {160,170,180,190,200},
                {210,220,230,240,250}
        };
        reverseCols(ar);
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
