package fixture;
public class UserController {
    private final UserService service = new UserService();
    public Object show(Request request) {
        String id = request.getParameter("id"); // SOURCE
        return service.find(id);
    }
    public Object importData(Request request) {
        byte[] body = request.getBody(); // SOURCE
        return service.importObject(body);
    }
}
