// Native: vm module sandbox escape. VULN: CWE-94
const vm = require("vm");

// VULN: user code runs with access to process via constructor chain
function runUserScript(code) {
  return vm.runInNewContext(code, { sandbox: {} });
}

module.exports = { runUserScript };
