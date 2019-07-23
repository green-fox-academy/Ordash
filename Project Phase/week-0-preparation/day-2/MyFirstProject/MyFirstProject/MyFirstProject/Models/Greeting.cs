using System;
namespace MyFirstProject.Models
{
    public class Greeting
    {
        public long Id { get; set; }
        public string Content { get; set; }
        public string[] Hellos { get; set; }
        private Random rndm;

        public Greeting()
        {
            this.Hellos = new string[]{
                "Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
            this.rndm = new Random();
        }

        public string GetRandomHello()
        {
            return Hellos[rndm.Next(Hellos.Length)];
        }

        public string GetRandomColor()
        {
            Random random = new Random();
            int r = random.Next(1, 256);
            int g = random.Next(1, 256);
            int b = random.Next(1, 256);

            return "color:rgb(" + r + ", " + g + ", " + b + ");";
        }

        public string GetRandomFontSize()
        {
            return "font-size:" + new Random().Next(10, 41) + "px;";
        }
    }
}
