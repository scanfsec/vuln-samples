// A08 - Integrity Failures. VULN: eval of remote config + prototype pollution.
// VULN: A08 - dynamic code execution
function loadPlugin(code) {
  return eval(code);
}

// VULN: A08 - prototype pollution merge
function merge(target, source) {
  for (const k in source) {
    if (typeof source[k] === "object") merge(target[k] ?? (target[k] = {}), source[k]);
    else target[k] = source[k];
  }
  return target;
}

module.exports = { loadPlugin, merge };
