class TransposeOfMatrix {
    public int[][] transpose(int[][] ar) {
        int m=ar.length;
        int n=ar[0].length;
        int res[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=ar[i][j];
                
            }
        }
        return res;
    }
}
