package demo
func UserLookup(id string) {
    query := "SELECT * FROM users WHERE id = '" + id + "'"
    QueryStore(query)
}
