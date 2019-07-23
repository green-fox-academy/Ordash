using System;

namespace delegatesLamdasLINQ
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            LINQpractice lINQpractice = new LINQpractice();
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            lINQpractice.Exercise1(n);
            Console.WriteLine("----");
            lINQpractice.Exercise2(n);
            Console.WriteLine("----");
            lINQpractice.Exercise3(n);
            Console.WriteLine("----");
            lINQpractice.Exercise4();
            Console.WriteLine("----");
            lINQpractice.Exercise5();
            Console.WriteLine("----");
            lINQpractice.Exercise6();
            Console.WriteLine("----");
            lINQpractice.Exercise7();
            Console.WriteLine("----");
            lINQpractice.Exercise8();
            Console.WriteLine("----");
            lINQpractice.Exercise9();
            Console.WriteLine("----");
            lINQpractice.Exercise10();
            Console.WriteLine("----");
            lINQpractice.Exercise11();


        }
    }
}
