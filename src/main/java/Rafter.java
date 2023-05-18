import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class Rafter extends Material{
    public Rafter(double width, double height, double length) {
        super(width, height, length);
    }

    @Override
    public Geometry3D create(JavaCSG csg) {
        return null;
    }
}
