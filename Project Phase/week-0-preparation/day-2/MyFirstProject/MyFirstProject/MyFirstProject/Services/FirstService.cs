using System;
namespace MyFirstProject.Services
{
    public class FirstService
    {
        private long apiGreetCounter;
        private long webGreetCounter;
        public FirstService()
        {
            apiGreetCounter = 0L;
            webGreetCounter = 0L;
        }

        public long ApiGreetCounter()
        {
            return apiGreetCounter++;
        }

        public long WebGreetCounter()
        {
            return webGreetCounter++;
        }

    }
}
