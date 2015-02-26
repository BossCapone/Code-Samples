using System;


namespace NavData
{
    class Cylinder : Shape
    {
        private double r, h;

        public Cylinder(double r, double h)
        {
            Console.WriteLine("Init a Cylinder object");
            this.r = r; this.h = h;
        }

        public override double Area()
        {
            Console.WriteLine("Calling Area defined in Cylinder");
            return 2 * pi * r * r + 2 * pi * r * h;
        }

    }
}
