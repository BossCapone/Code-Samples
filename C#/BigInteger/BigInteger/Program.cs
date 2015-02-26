using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;


    class SeedTest
    {
        public static NavData LCG(NavData Base, NavData multiplier, NavData increment, NavData exponet, NavData modulus) // Linear Congruential Generator
        {
            return NavData.ModPow(NavData.Add(NavData.Multiply(multiplier, Base), increment), exponet, modulus);
        }

        public static void Main()
        {
            BigInteger Base = 0;
            BigInteger multiplier = 6364136223846793005;
            BigInteger increment = 1442695040888963407;
            BigInteger exponet = 64;
            BigInteger mod = NavData.Pow(2,64);

            for (int i = 0; i < 10; i++)
            {
                Base = NavData.Add(Base, new BigInteger(i));
                BigInteger rand = LCG(Base, multiplier, increment, 1, mod);
                Console.WriteLine("Random number {0}: {1}",i, rand);
            }
            Console.ReadKey();
        }

    }



