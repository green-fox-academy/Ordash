using System;
namespace DIproject.Models
{
    public class RedColor : IColor
    {
        public void PrintColor()
        {
            Console.WriteLine("It is red in color...");
        }
    }
}
