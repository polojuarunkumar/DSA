class Solution {
    public void pattern14(int n) {
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}

//Output: 

// A
// AB
// ABC
// ABCD
// ABCDE
