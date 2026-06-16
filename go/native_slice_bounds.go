// Native: slice bounds bypass via subslicing. VULN: CWE-787
package main

// VULN: cap larger than len, caller can read past logical end
func leakSecret(data []byte) []byte {
  buf := make([]byte, 8, 64)
  copy(buf, data)
  return buf[:32] // VULN: extends past len into cap / adjacent data
}
