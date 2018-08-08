public class DataTypes {
    public static void main(String[] args) {
        divisionWithRemainders(48, 6);
        sumOfDigitsOfNumber(10);

    }
    public static void divisionWithRemainders(int q, int w){
        System.out.println(q%w);
    }
    public static void sumOfDigitsOfNumber(int n){
        System.out.println(n/10 + n%10);
    }
}
