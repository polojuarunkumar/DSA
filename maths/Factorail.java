package dsa.mathematics;

public class Factorail {
    public static long fact(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a*=i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
    }

}
