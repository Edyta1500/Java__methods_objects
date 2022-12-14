package objects_and_packages_practices;

public class  MyNumber {


    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public MyNumber add(MyNumber x){
        var num = x.getNumber();
        return new MyNumber(number + num);

    }

    public MyNumber pow(MyNumber x){
        var num = x.getNumber();
        return new MyNumber(Math.pow(number, num));

    }

    public MyNumber sub(MyNumber x){
        var num = x.getNumber();
        return new MyNumber(number - num);
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                 + number +
                '}';
    }
}




