package fixture;
public class SafeDao {
    public Object find(Connection c, String id) throws Exception {
        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
        ps.setString(1, id); // NEGATIVE: parameterized JDBC.
        return ps.executeQuery();
    }
}
