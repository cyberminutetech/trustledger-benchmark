package fixture
class SafeStore {
    fun find(db: Database, id: String) {
        // NEGATIVE: parameterized query.
        db.query("SELECT * FROM profiles WHERE id = ?", arrayOf(id))
    }
}
