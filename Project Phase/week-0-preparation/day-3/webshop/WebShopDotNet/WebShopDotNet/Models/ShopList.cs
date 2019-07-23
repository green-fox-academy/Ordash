using System;
using System.Collections.Generic;

namespace WebShopDotNet.Models
{
    public class ShopList
    {
        public List<ShopItem> ShopItems { get; set; }

        public ShopList()
        {
            this.ShopItems = new List<ShopItem>();
            ShopItems.Add(new ShopItem { Name = "Nike shoes", Description = "used", Price = 5600, QuantityOfStock = 5 });
            ShopItems.Add(new ShopItem { Name = "Iphone", Description = "broken", Price = 20000, QuantityOfStock = 10 });
            ShopItems.Add(new ShopItem { Name = "Mirror", Description = "shiny", Price = 345.67, QuantityOfStock = 0 });
            ShopItems.Add(new ShopItem { Name = "Chair", Description = "black", Price = 345.67, QuantityOfStock = 116 });
            ShopItems.Add(new ShopItem { Name = "Table", Description = "nice", Price = 345.67, QuantityOfStock = 0 });
            ShopItems.Add(new ShopItem { Name = "Dotnet", Description = "mierda", Price = 345.67, QuantityOfStock = 999});
        }
    }
}
