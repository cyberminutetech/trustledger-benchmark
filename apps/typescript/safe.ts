export async function safeInvoice(pool: any, id: string) {
  // NEGATIVE: parameterized query.
  return pool.query("SELECT * FROM invoices WHERE id = $1", [id]);
}
