function safeLookup(db, id) {
  // NEGATIVE: parameterized query.
  return db.query("SELECT * FROM profiles WHERE id = ?", [id]);
}
