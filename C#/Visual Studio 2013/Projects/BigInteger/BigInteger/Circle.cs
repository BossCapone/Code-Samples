using System;


namespace NavData
{
    class Circle : Shape 
    {
        private double r;

        public Circle(double r)
        {
            Console.WriteLine("Init a Circle object");
            this.r = r;
        }

        public override double Area()
        {
            Console.WriteLine("Calling Area defined in Circle");
            return pi * r * r;
        }


    }
}
