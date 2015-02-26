using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NavData;

namespace NavData
{
    class ShapePoly
    {
        static void Main ( string[] args)
        {
            double r = 3.0, h = 5.0;
			Shape circle1 = new Circle(r);
			Shape sphere1 = new Sphere(r);
			Shape cylinder1 = new Cylinder(r, h);

			// Display results:
	Console.WriteLine( "Area of Circle   = {0:F2}", circle1.Area() );
	Console.WriteLine( "Area of Sphere   = {0:F2}", sphere1.Area() );
	Console.WriteLine( "Area of Cylinder = {0:F2}", cylinder1.Area() );

			Console.WriteLine();

			// display through a common reference
			Shape shapeRef = circle1;
	Console.WriteLine( "Area of Shape 1  = {0:F2}", shapeRef.Area() );

			// display through a common reference
			shapeRef = sphere1;
	Console.WriteLine( "Area of Shape 2  = {0:F2}", shapeRef.Area() );

			// display through a common reference
			shapeRef = cylinder1;
	Console.WriteLine( "Area of Shape 3  = {0:F2}", shapeRef.Area() );
		

        }
    }
}
