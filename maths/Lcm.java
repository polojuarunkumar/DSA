import java.util.Scanner;

public class LCM {

    static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(a!=0){
            return a;
        }
        else {
            return b;
        }
    }

    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b=in.nextInt();
        System.out.println(lcm(a,b));

    }

}
