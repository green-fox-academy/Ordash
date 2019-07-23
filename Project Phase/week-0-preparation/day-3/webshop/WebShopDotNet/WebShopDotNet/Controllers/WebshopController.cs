using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebShopDotNet.Models;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace WebShopDotNet.Controllers
{
    public class WebshopController : Controller
    {
        [HttpGet("")]
        public IActionResult Index()
        {
            var myView = new ShopList();
            ViewBag.Items = myView.ShopItems;
            return View("Index",myView);
        }

        [HttpGet("/only-available")]
        public IActionResult OnlyAvailable()
        {
            var myView = new ShopList();
            ViewBag.Items = myView.ShopItems.Where(i => i.QuantityOfStock > 0);
            return View("Index", myView);
        }


    }
}
