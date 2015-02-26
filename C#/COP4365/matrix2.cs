using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace COP4365
{
    class matrix
    {
        static void Main1(string[] args)
        {
            int[,] a = { {0,0,1,2},
                         {0,1,2,3},
                         {1,4,5,6},
                         {2,7,8,9}
                       };
            int[,] b = new int[4,4];
            int[,] c = new int[4,4];

            for (int i = 0; i < 4; i++) // b=2a
            {
                for (int j = 0; j < 4; j++)
                {
                    b[i, j] = 2 * a[i, j] + 1;
                    
                }                
            }
           


            Console.WriteLine("A: ");
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Console.Write(a[i, j]);
                    Console.Write(", \t");

                }
                Console.Write("\n");
            }
            Console.WriteLine();
            Console.WriteLine("B: ");
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Console.Write(b[i, j]);
                    Console.Write(", \t");

                }
                Console.Write("\n");
            }
            Console.WriteLine();
            // dot prod

        
            Console.Write("Dot product: \n");

            for (int row = 0; row < 4; row++)
            {

                for (int col = 0; col < 4; col++)
                {
                    int v = 0;
                    for (int k = 0; k < 4; k++)  // array size
                    {
                        v += a[row, k] * b[k, col];
                    }
                    c[row, col] = v;

                    Console.Write(c[row, col]);
                    Console.Write(", \t");
                }

                Console.Write("\n");
            }
    

            

            Console.ReadKey();
        }


    }


}


