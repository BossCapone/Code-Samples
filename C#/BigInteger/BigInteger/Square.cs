using System;

namespace NavData
{
    class Square : Rectangle
    {
        private double s;

        public Square()
        {
            this.s = 0;
        }
        public Square (double length)
        {
            this.s = length;
        }

        public override double Area()
        {
            return s * s;
        }
    }
}
