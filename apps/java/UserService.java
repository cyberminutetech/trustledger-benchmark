package fixture;
public class UserService {
    private final UserDao dao = new UserDao();
    public Object find(String id) {
        return dao.raw("SELECT * FROM users WHERE id = '" + id + "'");
    }
    public Object importObject(byte[] body) {
        return dao.deserialize(body);
    }
}
