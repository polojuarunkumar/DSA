public class PrimeNumber{

  // Steps to write a primeNumber Program
// If the number is 0 or 1 return false
// If the number is 2 or 3 return true
// If the number is divisible by 2 or 3 return false
// we need to iterate the loop from i=5 to i<=Math.sqrt(n) and increment by 6
// If the number is divisible by i and divisible by i+2 return false
// else return true

  
  static boolean isPrime(int n){
    if(n==1 || n==0){
      return false;
    }
    if(n==2 || n==3){
      return true;
    }
    if(n%2==0 || n%3==0){
      return false;
    }
    for(int i=5;i*i<=n;i=i+6){
      if(n%i==0 || n%(i+2)==0){
        return false;
      }
    }
    return true;
  }
  
  public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(isPrime(n));
  }
}
