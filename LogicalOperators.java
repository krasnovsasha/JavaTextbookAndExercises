public class LogicalOperators {
    public static void main(String[] args) {

    }
    public static void oddOrEven(int n){
        if (n%2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
    public static void theNearestNumber(double a, double m, double n){
       if ((Math.abs(a-m)<Math.abs(a-n)) && (m!=n)){
           System.out.println("Число " + m + " ближе к числу " + a + " чем число " + n);
       }
       else if ((Math.abs(a-n)<Math.abs(a-m)) && (m!=n)){
           System.out.println("Число " + n + " ближе к числу " + a + " чем число " + m);
       }
       else
           System.out.println("Числа " + m + " и " + n + " находятся на одинаковом расстоянии от числа " + a);

    }
}
