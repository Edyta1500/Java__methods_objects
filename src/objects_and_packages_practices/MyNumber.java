package objects_and_packages_practices;

public class  MyNumber {

    private double number;


    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }


}



