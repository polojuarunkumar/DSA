import java.util.ArrayList;
import java.util.List;

public class SprialMatirx {

    static List<Integer> spiralOrder(int [][] matrix){
        int top=0,bottom=matrix.length-1;
        int left=0,right= matrix.length-1;

        List<Integer> spiral = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;i++){
                spiral.add(matrix[i][right]);
            }
            right--;

            if(!(left<=right && top<=bottom)){
                break;
            }
            for(int i = right;i>=left;i--){
                spiral.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }

    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        List<Integer> l=spiralOrder(matrix);
        System.out.println(l);
    }
}
