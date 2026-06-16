// Native: unsafe pointer arithmetic. VULN: CWE-822
package main

import "unsafe"

// VULN: reads arbitrary memory via unsafe
func readBeyond(slice []byte, offset int) byte {
  ptr := unsafe.Pointer(&slice[0])
  return *(*byte)(unsafe.Pointer(uintptr(ptr) + uintptr(offset)))
}
