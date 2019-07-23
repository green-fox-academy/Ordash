using System;
using System.Collections.Generic;
using System.Linq;

namespace Csharp_Basics_Bana
{
    class Program
    {

        static void Main(string[] args)
        {
            MyClass obj = new MyClass();
            obj.LongRunning(Callback);

        }


        static void Callback(int i)
        {
            Console.WriteLine(i);
        }
        public class MyClass
        {
            public delegate void CallBack(int i);
            public void LongRunning(CallBack obj)
            {
                for (int i = 0; i < 10000; i++)
                {
                    //does somthing
                    obj(i);
                }
            }
        }

        private static void SayHello()
        {
            string name = "";
            Console.Write("What is your name : ");
            name = Console.ReadLine();
            Console.WriteLine("Hello {0}", name); 
        }

        private static void basics()
        {
            var scores = new int[] { 13, 15, 74, 234, 356, };

            // solving it with good old for loop
            var scoresWithLooop = new List<int>();

            for (int i = 0; i < scores.Length; i++)
            {
                if (scores[i] > 30)
                {
                    scoresWithLooop.Add(scores[i]);
                }
            }

            scoresWithLooop.ForEach(Console.WriteLine);

            //with magic

            // method syntax
            var scoreQueryMethods = scores.Where(s => s > 30);

            // query syntax


            Console.WriteLine("Hello World!");


            string[] myArgs = Environment.GetCommandLineArgs();

            for (int i = 0; i < myArgs.Length; i++)
            {
                Console.WriteLine("Arg {0} : {1}", i, myArgs[i]);
            }

            Console.WriteLine(string.Join(", ", myArgs));


            SayHello();


            //bool canIVote = true;

            decimal decPiVal = 3.141592M;
            decimal decBigNum = 3.000000000000000000011M;

            Console.WriteLine("DEC : PI + BigNum = {0}", decPiVal + decBigNum);


            Console.WriteLine("Biggest Decimal: {0}", decimal.MaxValue);
            Console.WriteLine("Smallest Decimal: {0}", decimal.MinValue);
        }
    }
}
