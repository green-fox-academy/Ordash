using System;
using System.Threading.Tasks;
using DIproject.Models;
using Microsoft.AspNetCore.Http;

namespace DIproject.MiddleWares
{
    public class ConsoleLoggerMiddleware : IMiddleware
    {
        private readonly Printer _printer;
        private readonly RedColor _red;

        public ConsoleLoggerMiddleware(Printer printer, RedColor red)
        {
            _printer = printer;
            _red = red;
        }

     
        public Task InvokeAsync(HttpContext context, RequestDelegate next)
        {
            Console.WriteLine("Hi from the middleware");
            _printer.Log("Hello");
            _red.PrintColor();

            return next(context);
        }
        
    }
}
