// A04 - Insecure Design. VULN: price tampering accepted from client.
// VULN: A04 - trusts client-supplied price
function checkout(cart) {
  let total = 0;
  for (const item of cart.items) {
    total += item.clientPrice * item.qty;
  }
  charge(total);
  return { ok: true };
}

function charge(_) {}

module.exports = { checkout };
