namespace TrustLedgerFixture;
public class UserService {
    private readonly UserRepository repository = new();
    public object Find(string id) => repository.FindRaw("SELECT * FROM Users WHERE Id = '" + id + "'");
    public string BuildPreview(string bio) => bio; // flows to Razor view
}
