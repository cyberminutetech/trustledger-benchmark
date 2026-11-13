import { fetchInvoice, generatePreview } from "./service";
export async function invoice(req: any, res: any) {
  const invoiceId = req.query.id; // SOURCE
  res.json(await fetchInvoice(invoiceId));
}
export async function preview(req: any, res: any) {
  const template = req.body.template; // SOURCE
  res.send(await generatePreview(template));
}
