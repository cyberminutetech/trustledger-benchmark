export async function executeSql(query: string) {
  // SINK: SQL execution.
  return pool.query(query); // noqa: fixture symbol
}
export async function renderTemplate(template: string) {
  // SINK: dynamic template compilation.
  return compileTemplate(template)({});
}
