package methods;


public class MyMe {
    public static void main(String[] args) {


        System.out.println(getName());

        System.out.println(getAge());

        System.out.println(isEven(8));

        System.out.println(divisible(5));


        System.out.println(isItRectangularTriangle(3,3,4.2));


    }

    private static String getName() {
        return "Edyta";

    }

    private static int getAge() {
        int i = 42;
        return i;
    }


    private static void calculate(int num1, int num2) {
        int sum = num1 + num2;
        int min = num1 - num2;
        int multi = num1 * num2;

        System.out.println(num1 + " + " + num2 + " =  " + sum);
        System.out.println(num1 + " - " + num2 + " =  " + min);
        System.out.println(num1 + " * " + num2 + " =  " + multi);

    }

    private static boolean isEven(int number) {

        return number % 2 == 0;
    }

    static boolean divisible(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static double thirdPower(int number) {
        return Math.pow(number, 3);
    }

    private static double square(int number) {
        return Math.sqrt(number);
    }




    private static boolean isItRectangularTriangle(double a, double b, double c) {
        if (a > 0 && b>0 &&c> 0) {

            double x = Math.round(Math.pow(a, 2));
            double y = Math.round(Math.pow(b, 2));
            double z = Math.round(Math.pow(c, 2));

            return ((((x + y) == z) || ((z + x) == y) || ((y + z) == x)));

        } else {

            throw new IllegalStateException("Wartości a, b i c muszą być większe od zera");
        }


    }


}