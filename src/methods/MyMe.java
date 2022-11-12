package methods;


public class MyMe {
    public static void main(String[] args) {


        System.out.println(getName());

        System.out.println(getAge());

        System.out.println(isEven(8));

        System.out.println(divisible(5));


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


    private static boolean isItTriangle(int a, int b, int c) {
        double x = Math.pow(a, 2);
        double y = Math.pow(b, 2);
        double z = Math.pow(c, 3);
        if ((((x + y) == z) || ((z + x) == y) || ((y + z) == x))) return true;
        else return false;

    }

}