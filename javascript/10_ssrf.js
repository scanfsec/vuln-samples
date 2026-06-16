// A10 - SSRF. VULN: axios/fetch to internal metadata.
const http = require("http");

// VULN: A10 - SSRF via user URL
function proxyImage(url, res) {
  http.get(url, (r) => {
    r.pipe(res);
  });
}

module.exports = { proxyImage };
