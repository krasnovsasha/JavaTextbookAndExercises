public class DataTypes {
    public static void main(String[] args) {
        divisionWithRemainders(48, 6);
        sumOfDigitsOfNumber(10);
        roundingOfNumber(2.0);
      sumOfDigitsOf3Numbers(321);

    }
    public static void divisionWithRemainders(int q, int w){
        System.out.println(q%w);
    }
    public static void sumOfDigitsOfNumber(int n){
        System.out.println(n/10 + n%10);
    }
    public static void roundingOfNumber(double n){
        int a;
        System.out.println(a = (int) (0.5 + n));
    }
    public static void sumOfDigitsOf3Numbers(int n){
        System.out.println((n/100) + (n%100)/10 + n%10);

    }
}
