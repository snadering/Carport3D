import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Test
{
	public static void main(String[] args)
	{
		ReadInput.getCarportDimensions();
		JavaCSG csg = JavaCSGFactory.createDefault();
		Material post = new Post(10, 10, 100);
		Material rafter = new Rafter(10, 10, 100);
		Material purlin = new Purlin(10, 10, 100);
		csg.view(post.create(csg), 1);
		csg.view(post.create(csg), 2);
	}
}
