using System;

namespace NavData
{
    class Sphere : Shape
    {
        private double r;

        public Sphere(double r)
        {
            Console.WriteLine("Init a Sphere object");
            this.r = r;
        }

        public override double Area()
        {
            Console.WriteLine("Calling Area defined in Sphere");
            return 4 * pi * r * r;
        }
    }
}
