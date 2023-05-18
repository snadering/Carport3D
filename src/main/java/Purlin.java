import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class Purlin extends Material{
    public Purlin(double width, double height, double length) {
        super(width, height, length);
    }

    @Override
    public Geometry3D create(JavaCSG csg) {
        var purlin = csg.box3D(getWidth(), getLength(), getHeight(), false);
        var wall1 = csg.box3D(10, 2, getHeight(), false);
        var wall2 = csg.box3D(10, 2, getHeight(), false);
        wall1 = csg.translate3D(0, getLength()/2, 0).transform(wall1);
        wall2 = csg.translate3D(0, -(getLength()/2), 0).transform(wall2);
        return csg.union3D(purlin, wall1, wall2);
    }

}
