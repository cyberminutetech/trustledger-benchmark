function rawLookup(sql) {
  // SINK: SQL query execution.
  return db.query(sql); // noqa: undefined fixture database
}
module.exports = { rawLookup };
