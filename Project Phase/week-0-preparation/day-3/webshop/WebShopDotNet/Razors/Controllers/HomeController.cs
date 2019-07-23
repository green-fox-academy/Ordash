using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Razors.Models;
using Razors.ViewModels;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace Razors.Controllers
{
    public class HomeController : Controller
    {

        //[HttpGet("")]
        public IActionResult IndexWithForm()
        {
            return View("IndexWithForm");
        }


        //[HttpPost()]
        public IActionResult Index([FromQuery]Contact contact)
        {
            //Contact contact = new Contact()
            //{
            //    Id = 1,
            //    FirstName = "Steve",
            //    LastName = "Bishop"
            //};

            Customer customer = new Customer()
            {
                Id = 2,
                CustomerName = "The Company"
            };
            HomeIndexViewModel viewModel = new HomeIndexViewModel()
            {
                Contact = contact,
                Customer = customer
            };

            return View(viewModel);
        }
    }
}
