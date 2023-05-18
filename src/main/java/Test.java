import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		List<Double> materials = ReadInput.getCarportDimensions();
		JavaCSG csg = JavaCSGFactory.createDefault();
		Material post = new Post(10, 10, materials.get(1));
		Material rafter = new Rafter(5, 20, materials.get(0));
		Material purlin = new Purlin(5, 20, materials.get(2));
		csg.view(post.create(csg), 0);
		csg.view(rafter.create(csg), 1);
		csg.view(purlin.create(csg), 2);
		Guide.walkthrough((int) (materials.get(2)/25));
	}
}
