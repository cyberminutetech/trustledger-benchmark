package demo
import "net/http"
func UserHandler(w http.ResponseWriter, r *http.Request) {
    id := r.URL.Query().Get("id") // SOURCE
    UserLookup(id)
}
func PreviewHandler(w http.ResponseWriter, r *http.Request) {
    name := r.URL.Query().Get("name") // SOURCE
    RenderPreview(w, name)
}
