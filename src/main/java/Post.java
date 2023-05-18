import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class Post extends Material{
    public Post(double width, double height, double length) {
        super(width, height, length);
    }

    @Override
    public Geometry3D create(JavaCSG csg) {
        var post = csg.box3D(getLength(), getHeight(), getWidth(), false);
        var cut = csg.box3D(11, 6, getWidth()+2, false);
        cut = csg.translate3D(getLength()/2-5, 0, -1).transform(cut);


        return csg.difference3D(post, cut);
    }


}
