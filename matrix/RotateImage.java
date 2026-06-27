public class RotateImage {
    public static void rotate(int[][] ar) {
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }

        for(int i=0;i<ar.length;i++){
            int left=0;
            int right=ar[0].length-1;
            while(left<=right){
                int temp=ar[i][left];
                ar[i][left]=ar[i][right];
                ar[i][right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int ar[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate(ar);
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
