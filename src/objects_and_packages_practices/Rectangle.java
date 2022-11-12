package objects_and_packages_practices;

public class Rectangle {
    private float width;
    private float height;

    public float areaOfRectangle(){
        return width*height;
    }

    public float circumferenceOfRectangle(){
        return 2*(width + height);
    }

    public double diagonalOfTriangle(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
    }

}
