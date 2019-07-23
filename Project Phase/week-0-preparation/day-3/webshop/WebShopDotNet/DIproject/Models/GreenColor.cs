using System;
namespace DIproject.Models
{
    public class GreenColor : IColor
    {
        public void PrintColor()
        {
            Console.WriteLine("It is green in color");
        }
    }
}
