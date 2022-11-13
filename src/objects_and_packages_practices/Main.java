package objects_and_packages_practices;

public class Main {
    public static void main(String[] args) {

        MyNumber pow1 = new MyNumber(5).pow(new MyNumber(2));
        MyNumber add1 = new MyNumber(5).add(new MyNumber(5));
        MyNumber sub1 = new MyNumber(5).sub(new MyNumber(5));
        System.out.println(pow1);
        System.out.println(add1);
        System.out.println(sub1);
    }
}
