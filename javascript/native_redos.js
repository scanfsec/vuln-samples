// Native: ReDoS in Node. VULN: CWE-1333
const evil = /^(a+)+$/;

function isValid(input) {
  return evil.test(input); // VULN: catastrophic backtracking
}

module.exports = { isValid };
