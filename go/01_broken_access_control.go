// A01 - Broken Access Control. VULN: missing auth on admin handler.
package main

import "net/http"

// VULN: A01 - no auth middleware
func deleteUser(w http.ResponseWriter, r *http.Request) {
	id := r.URL.Query().Get("id")
	// db.Exec("DELETE FROM users WHERE id=?", id) without checking caller
	_, _ = w.Write([]byte("deleted " + id))
}
