using System;

namespace NavData
{
    public class Rectangle : Shape
    {
        private double l;
        private double w;

        public Rectangle(double l, double w)
        {
            Console.WriteLine("Init a Rectangle object");
            this.l = l;
            this.w = w;
        }

        public override double Area()
        {
            Console.WriteLine("Calling Area defined in Rectangle");
            return l * w;
        }
    }
}
