import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class Post extends Material{
    public Post(double width, double height, double length) {
        super(width, height, length);
    }

    @Override
    public Geometry3D create(JavaCSG csg) {


        return csg.box3D(getLength(), getHeight(), getWidth(), false);
    }


}
