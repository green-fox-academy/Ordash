using System;
namespace DIproject.Models
{
    public class BlueColor : IColor
    {
        public void PrintColor()
        {
            Console.WriteLine("It is blue in color...");
        }
    }
}
