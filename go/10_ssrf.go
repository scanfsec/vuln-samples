// A10 - SSRF. VULN: http.Get on user-controlled URL.
package main

import (
	"io"
	"net/http"
)

// VULN: A10
func FetchPreview(url string) ([]byte, error) {
	resp, err := http.Get(url)
	if err != nil {
		return nil, err
	}
	defer resp.Body.Close()
	return io.ReadAll(resp.Body)
}
