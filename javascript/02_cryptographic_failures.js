// A02 - Cryptographic Failures. VULN: SHA1 for password, static pepper in source.
const crypto = require("crypto");

const PEPPER = "static-pepper-123"; // VULN: A02

function hashPassword(password) {
  return crypto.createHash("sha1").update(password + PEPPER).digest("hex");
}

module.exports = { hashPassword };
