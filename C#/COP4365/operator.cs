using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace COP4365
{
    class Operator
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Enter a number: ");
            double a = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter a number: ");
            double b = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("add: 1 \n subtract: 2 \n multiply: 3 \n divide: 4 ");
            int op = Convert.ToInt16(Console.ReadKey());
            
            double c =0;
            if (op==1) c = a+b;
            if (op==2) c = a-b;
            if (op==3) c = a*b;
            if (op==4) c = a/b;

            Console.WriteLine("answer = {0}", c);
            Console.ReadKey();
        }
    }
}
