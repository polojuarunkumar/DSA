class TrailingZeros{
  //    n!=n/5+n/25+n/125+n/625+ ..........infinity
//    Example: 200! =
//    200/5=40
//    200/25=8
//    200/125=1
//    200/625....=0
//    Total trailing Zeros = 40+8+1+0=49

//    1. Check if n is less than or equal to powerOf5(numerator should greater than denominator)
//    2. Result+=(n/powerOf5)
//    3. powerOf5=powerOf5*5;
//    4. Repeat step 1 until condition becomes false

    public static int trailingZeros(int n){
        int powerOf5=5;
        int res=0;
        while(n>=powerOf5){
            res=res+(n/powerOf5);
            powerOf5=powerOf5*5;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeros(200));
    }
}
