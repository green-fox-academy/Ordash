using System;
namespace delegatesLamdasLINQ
{
    public class Fox
    {
        public string name { get; set; }
        public string type { get; set; }
        public string color { get; set; }

        public Fox(string name, string type, string color)
        {
            this.name = name;
            this.type = type;
            this.color = color;
        }
    }
}
