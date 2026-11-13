using Microsoft.AspNetCore.Mvc;
namespace TrustLedgerFixture;
public class UsersController : Controller {
    private readonly UserService service;
    public UsersController(UserService service) { this.service = service; }
    public IActionResult Details(string id) { // SOURCE: route/query parameter
        return Json(service.Find(id));
    }
    public IActionResult Preview(string bio) { // SOURCE
        ViewData["Bio"] = service.BuildPreview(bio);
        return View();
    }
}
