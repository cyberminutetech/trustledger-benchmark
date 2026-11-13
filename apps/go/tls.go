package demo
import "crypto/tls"
func insecureClient() *tls.Config {
    // SINK: certificate verification disabled.
    return &tls.Config{InsecureSkipVerify: true}
}
