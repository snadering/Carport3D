import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class Rafter extends Material{
    public Rafter(double width, double height, double length) {
        super(width, height, length);
    }

    @Override
    public Geometry3D create(JavaCSG csg) {
       var rafter = csg.box3D(getWidth(), getLength()+10, getHeight(), false);
       var cut1 = csg.box3D(getWidth()+2, 6, 11, false);
       var cut2 = csg.box3D(getWidth()+2, 6, 11, false);
       cut1 = csg.translate3D(0, getLength()/2-10, -1).transform(cut1);
       cut2 = csg.translate3D(0, -(getLength()/2-10), -1).transform(cut2);

       return csg.difference3D(rafter, cut1, cut2);
    }
}
