package dsa.mathematics;

public class CountNumberOfDigits {
//    1. check if digits exists.
//    2. Remove the last digit by and divide number by 10
//    3. Increase value of count by 1.
//    4. Repeat step 1 to step 3 till digits remains.

// Example: Input: n=1234, Output=4
// Explanation: 1234/10  = 123
//               123/10  = 12
//                12/10  = 1
//                 1/10  = 0


    public static int countNumberOfDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOfDigits(1236));
    }
}
