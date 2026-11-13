package fixture
class ProfileController(private val service: ProfileService) {
    suspend fun show(request: Request): Any {
        val id = request.query("id") // SOURCE
        return service.find(id)
    }
    fun preview(request: Request, webView: WebView) {
        val html = request.body("html") // SOURCE
        service.render(webView, html)
    }
}
