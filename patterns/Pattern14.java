class Solution {
    public void pattern15(int n) {
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}

// Output:

// ABCDE
// ABCD
// ABC
// AB
// A
