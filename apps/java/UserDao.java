package fixture;
import java.sql.*;
import java.io.*;
public class UserDao {
    public Object raw(String sql) throws Exception {
        // SINK: JDBC statement execution.
        return connection.createStatement().executeQuery(sql);
    }
    public Object deserialize(byte[] body) throws Exception {
        // SINK: unsafe Java native deserialization.
        return new ObjectInputStream(new ByteArrayInputStream(body)).readObject();
    }
}
