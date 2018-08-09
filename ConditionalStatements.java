
public class ConditionalStatements {
    public static void main(String[] args) {
        random50155(5, 155, 25, 100);

    }

        public static void random50155(int a, int b, int c, int d) {
        int b1 = b - a + 1;
        int random = a + (int) (Math.random() * b1);
            if (random > c && random < d){
                System.out.println("Число " + random + " содержится в интервале " + "(" + c + "," + d + ")");
            }
            else
                System.out.println("Число " + random + " не содержится в интервале " + "(" + c + "," + d + ")");

        }



}
