using System.Security.Cryptography;
public class CryptoFixture {
    public byte[] Hash(string input) {
        // SINK: weak hash for security-sensitive integrity/password use.
        return MD5.HashData(System.Text.Encoding.UTF8.GetBytes(input));
    }
}
