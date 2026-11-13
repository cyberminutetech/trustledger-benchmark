export async function paymentWebhook(req: any) {
  const event = req.body; // SOURCE
  // SINK: trusted payment event processed without signature verification.
  return processPayment(event);
}
