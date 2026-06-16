// A02 - Cryptographic Failures. VULN: MD5 + hardcoded AES key.
package main

import (
	"crypto/md5"
	"encoding/hex"
)

var aesKey = []byte("sixteen-byte-key") // VULN: A02

func HashPassword(pw string) string {
	h := md5.Sum([]byte(pw))
	return hex.EncodeToString(h[:])
}
