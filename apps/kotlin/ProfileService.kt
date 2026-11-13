package fixture
class ProfileService(private val store: ProfileStore) {
    suspend fun find(id: String): Any {
        return store.raw("SELECT * FROM profiles WHERE id = '$id'")
    }
    fun render(webView: WebView, html: String) {
        store.loadHtml(webView, html)
    }
}
