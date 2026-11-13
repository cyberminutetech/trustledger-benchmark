package demo
import ("database/sql"; "html/template"; "os/exec"; "net/http")
var database *sql.DB
func QueryStore(query string) {
    // SINK: database query with concatenated SQL.
    database.Query(query)
}
func RenderPreview(w http.ResponseWriter, name string) {
    // SINK: template execution with untrusted content (context depends on template).
    tmpl, _ := template.New("preview").Parse("<h1>" + name + "</h1>")
    tmpl.Execute(w, nil)
}
func Ping(host string) {
    // SINK: command execution with concatenated argument.
    exec.Command("sh", "-c", "ping -c 1 " + host).Run()
}
