using System.Data.SqlClient;
namespace TrustLedgerFixture;
public class UserRepository {
    public object FindRaw(string sql) {
        // SINK: SQL command execution.
        using var command = new SqlCommand(sql);
        return command.ExecuteReader();
    }
}
