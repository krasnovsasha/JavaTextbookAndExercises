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
    public static void quadraticEquation(double a, double b, double c){
        double x1;
        double x2;
        double d = 0;
        if (a == 0 && b == 0 && c != 0)
            System.out.println("Уравнение решений не имеет");
        else if (a == 0 && b == 0 && c == 0)
            System.out.println("Уравнение имеет бесчисленное множество решений");
        else
            d = (b*b)-(4*a*c);
            x1 = ((-b+(Math.pow(d, 0.5)))/(a*2));
            x2 = ((-b-(Math.pow(d, 0.5)))/(a*2));
            if (d < 0)
                System.out.println("Дискриминант " + d + " отрицательный. Корни уравнения комплексные");
            else
        System.out.println("Корни уравнения равны: " + x1 + " " + x2);
    }

}
