function redirect(req, res) {
  const next = req.query.next; // SOURCE
  // SINK: open redirect.
  res.redirect(next);
}
