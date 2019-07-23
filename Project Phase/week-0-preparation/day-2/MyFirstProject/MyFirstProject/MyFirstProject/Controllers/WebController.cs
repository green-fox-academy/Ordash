using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using MyFirstProject.Models;
using MyFirstProject.Services;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace MyFirstProject.Controllers
{
    [Route("web")]
    public class WebController : Controller
    {
        private readonly FirstService firstService;

        public WebController(FirstService firstService)
        {
            this.firstService = firstService;
        }

        [HttpGet("greeting")]
        public IActionResult Greeting(string name)
        {
            var greeting = new Greeting()
            {
                Id = firstService.WebGreetCounter(),
                Content = name
            };

            return View(greeting);
        }
    }
}
