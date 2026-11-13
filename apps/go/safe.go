package demo
func SafeQuery(db *sql.DB, id string) {
    // NEGATIVE: parameterized query.
    db.Query("SELECT * FROM users WHERE id = ?", id)
}
