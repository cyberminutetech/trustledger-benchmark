using System.Data.SqlClient;
namespace TrustLedgerFixture;
public class SafeRepository {
    public SqlCommand Find(SqlConnection connection, string id) {
        var command = new SqlCommand("SELECT * FROM Users WHERE Id = @id", connection);
        command.Parameters.AddWithValue("@id", id); // NEGATIVE: parameterized.
        return command;
    }
}
