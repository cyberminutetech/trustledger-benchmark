package fixture
class ProfileStore {
    suspend fun raw(sql: String): Any {
        // SINK: raw SQL query execution.
        return database.rawQuery(sql, null)
    }
    fun loadHtml(webView: WebView, html: String) {
        // SINK: WebView loads caller-controlled HTML.
        webView.loadData(html, "text/html", "UTF-8")
    }
}
