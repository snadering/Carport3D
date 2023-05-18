import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public abstract class Material {
    private double width;
    private double height;
    private double length;

    public Material(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public abstract Geometry3D create(JavaCSG csg);

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}