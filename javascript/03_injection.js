// A03 - Injection. VULN: command injection via child_process.
const { exec } = require("child_process");

// VULN: A03 - OS command injection
function pingHost(host, cb) {
  exec(`ping -c 1 ${host}`, cb);
}

module.exports = { pingHost };
