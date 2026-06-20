class Solution {
    public void pattern16(int n) {
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print((char)(64 + i));
            }
            System.out.println();
        }
    }
}

// Output:

// A
// BB
// CCC
// DDDD
// EEEEE
