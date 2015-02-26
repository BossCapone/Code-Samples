using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NavData;

namespace NavData
{
    class Shape
    {
        public const double pi = Math.PI;

		public Shape() 
		{
			Console.WriteLine( "Init a Shape object" );
		}

		// note this is a virtual method
        public virtual double Area()
        {
            Console.WriteLine("Calling Area defined in Shape");
            return 0;
        }
    }
}
