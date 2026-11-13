fun configure(view: WebView) {
    // SINK: risky WebView configuration; review file/content access and JS trust boundaries.
    view.settings.allowFileAccess = true
    view.settings.javaScriptEnabled = true
}
