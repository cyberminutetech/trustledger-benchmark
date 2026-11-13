import { executeSql, renderTemplate } from "./sinks";
export async function fetchInvoice(id: string) {
  return executeSql("SELECT * FROM invoices WHERE id = '" + id + "'");
}
export async function generatePreview(template: string) {
  return renderTemplate(template);
}
