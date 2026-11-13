pub fn safe_query(conn: &Db, id: &str) {
    // NEGATIVE: parameterized query API.
    conn.execute("SELECT * FROM users WHERE id = ?", [id]);
}
