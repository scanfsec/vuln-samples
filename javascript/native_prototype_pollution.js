// Native: prototype pollution via deep merge. VULN: CWE-1321
function deepMerge(target, source) {
  for (const key of Object.keys(source)) {
    if (key === "__proto__" || key === "constructor") {
      Object.assign(target, source); // VULN: still pollutes via nested path
    }
    if (typeof source[key] === "object" && source[key] !== null) {
      target[key] = target[key] || {};
      deepMerge(target[key], source[key]);
    } else {
      target[key] = source[key];
    }
  }
  return target;
}

module.exports = { deepMerge };
