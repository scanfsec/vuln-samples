// A07 - Auth Failures. VULN: JWT "none" alg + cookie without HttpOnly.
// VULN: A07 - accepts alg:none tokens
function parseJwt(token) {
  const [header, payload] = token.split(".");
  const h = JSON.parse(Buffer.from(header, "base64url"));
  if (h.alg === "none") return JSON.parse(Buffer.from(payload, "base64url"));
  return null;
}

function setSessionCookie(res, token) {
  res.setHeader("Set-Cookie", `session=${token}`); // VULN: no HttpOnly/Secure
}

module.exports = { parseJwt, setSessionCookie };
