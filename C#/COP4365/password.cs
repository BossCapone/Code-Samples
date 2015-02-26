using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace COP4365
{
    class password
    {
        static void Main(string[] args)
        {
            int[] arr = new int[5];

            int num = 0;
            Console.WriteLine("Type in atleast 5 numbers: ");
            while (num <5)
            {
                int x = Convert.ToInt16(Console.ReadLine());
                if (x < 100 && x > 10)
                {
                    bool display = true;
                    for (int i = 0; i < 5; i++)
                    {
                        if (x == arr[i]) display = false;
                        else arr[i] = x; 
                    }
                    if (display)
                    {
                        Console.WriteLine(x);

                    }
                }
                else continue;

                num++;
            }

            Console.ReadKey();
        }
    }
}
