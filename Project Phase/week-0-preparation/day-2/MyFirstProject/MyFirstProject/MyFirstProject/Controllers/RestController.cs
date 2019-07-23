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

    [Route("api")]
    public class RestController : Controller
    {

        private FirstService firstService;

        public RestController(FirstService firstService)
        {
            this.firstService = firstService;
        }


        [HttpGet("greeting")]
        public Greeting Greet(string name)
        {
            return new Greeting()
            {
                Id = firstService.ApiGreetCounter(),
                Content = name

            };
        }
    }

    
}
