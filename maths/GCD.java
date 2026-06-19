package dsa.mathematics;

public class GCD {

    // Brute Force Approach
    static int gcdBruteForceApproach(int a,int b){
        int min=0;
        if(a<b){
            min=a;
        }
        else{
            min=b;
        }
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    // Optimized Approach
    static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0) {
            return a;
        }
        else{
            return b;
        }
    }


    public static void main(String[] args) {
        System.out.println(gcdBruteForceApproach(20,15));
        System.out.println(gcd(15,20));
    }
}
