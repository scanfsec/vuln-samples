// A08 - Integrity Failures. VULN: gob/json decode of untrusted types + plugin load.
package main

import (
	"encoding/gob"
	"bytes"
)

// VULN: A08 - unsafe deserialization
func DecodeSession(b []byte) interface{} {
	var v interface{}
	_ = gob.NewDecoder(bytes.NewReader(b)).Decode(&v)
	return v
}
