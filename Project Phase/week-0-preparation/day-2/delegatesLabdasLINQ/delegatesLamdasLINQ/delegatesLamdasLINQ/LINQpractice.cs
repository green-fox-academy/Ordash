using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

namespace delegatesLamdasLINQ
{
    public class LINQpractice
    {
        public LINQpractice()
        {
        }

        //Write a LINQ Expression to get the even numbers from the following array:
        public void Exercise1(int[] numberArray)
        {

            numberArray.Where(n => n % 2 == 0).ToList().ForEach(Console.WriteLine);

        }

        //Write a LINQ Expression to get the average value of the odd numbers from the following array:
        public void Exercise2(int[] numberArray)
        {

            Console.WriteLine(numberArray.Where(n => n % 2 == 1).Average());
        }

        //Write a LINQ Expression to get the squared value of the positive numbers from the following array:
        public void Exercise3(int[] numberArray)
        {
            numberArray.Where(n => n > 0).ToList().ConvertAll(n => n * n).ForEach(Console.WriteLine);
        }

        //Write a LINQ Expression to find which number squared value is more then 20 from the following array:
        public void Exercise4()
        {
            int[] numberArray = new[] { 3, 9, 2, 8, 6, 5 };

            numberArray.Where(n => n * n > 20).ToList().ForEach(Console.WriteLine);

        }

        //Write a LINQ Expression to find the frequency of numbers in the following array:
        public void Exercise5()
        {
            int[] numberArray = { 5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2 };

            numberArray.GroupBy(n => n).Select(p => new { MainKey = p.Key, MainCount = p.Count() }).ToList().ForEach(Console.WriteLine);

        }

        //Write a LINQ Expression to find the frequency of characters in a given string.
        public void Exercise6()
        {
            "Ddoooooooriririri".ToCharArray().GroupBy(c => c).Select(p => new { MainKey = p.Key, MainCount = p.Count() }).ToList().ForEach(Console.WriteLine);
        }

        //Write a LINQ Expression to find the strings which starts with A and ends with I in the following array:
        public void Exercise7()
        {
            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };

            cities.Where(s => s.StartsWith("A", StringComparison.Ordinal) && s.EndsWith("I", StringComparison.Ordinal)).ToList().ForEach(Console.WriteLine);
        }

        //Write a LINQ Expression to find the uppercase characters in a string.
        public void Exercise8()
        {
            "GreeNFoX".ToCharArray().Where(c => char.IsUpper(c)).ToList().ForEach(Console.WriteLine);
        }

        //Write a LINQ Expression to convert a char array to a string.
        public void Exercise9()
        {
            Console.WriteLine(new string(new char[] { 'g', 'r', 'e', 'e', 'n', 'f', 'o', 'x' }));
        }


        //Create a Fox class with 3 properties: name, type and color.

        //Fill a list with at least 5 foxes, it's up to you how you name/create them.
        //Write a LINQ Expression to find the foxes with green color.
        //Write a LINQ Expression to find the foxes with green color and pallida type.
        //Write a Stream Expression to find the frequency of foxes by color!
        public void Exercise10()
        {
            var foxList = new List<Fox>();
            foxList.Add(new Fox("Adam", "A", "Blue"));
            foxList.Add(new Fox("Dori", "pallida", "Red"));
            foxList.Add(new Fox("Mike", "C", "Green"));
            foxList.Add(new Fox("Archie", "D", "Yellow"));
            foxList.Add(new Fox("Adam", "pallida", "Green"));
            foxList.Add(new Fox("Misi", "E", "Orange"));

            foxList.Where(f => f.color == "Green").ToList().ForEach(f => Console.WriteLine(f.name));

            Console.WriteLine("-------");

            foxList.Where(f => f.color == "Green" && f.type == "pallida").ToList().ForEach(f => Console.WriteLine(f.name));

        }


        //Find a random Wikipedia article and copy the contents to a txt file.
        //Create a single LINQ expression which reads all text from this file, 
        //and prints the 100 most common words in descending order.
        //Keep in mind that the text contains punctuation characters which should be ignored
        public void Exercise11()
        {
            try
            {
                using (StreamReader reader = new StreamReader("Wiki.txt"))
                {
                    string str = reader.ReadToEnd();
                    char[] charArr = str.ToCharArray();
                    var noPunctuation = new string(charArr.Where(ch => !char.IsPunctuation(ch)).ToArray());

                    noPunctuation.Split(' ')
                        .ToList()
                        .ConvertAll(b => b.ToLower())
                        .GroupBy(r => r)
                        .Select(w => new { Word = w.Key, Count = w.Count() })
                        .OrderByDescending(w => w.Count)
                        .Take(100).ToList()
                        .ForEach(Console.WriteLine);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("The file could not be read: ");
                Console.WriteLine(e.Message);

            }
        }
    }
}
