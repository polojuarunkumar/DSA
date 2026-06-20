class Solution {
    public void pattern10(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

//Ouptut:

// *********
//  *******
//   *****
//    ***
//     *
