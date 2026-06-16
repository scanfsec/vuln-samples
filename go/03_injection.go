// A03 - Injection. VULN: SQL injection via fmt.Sprintf.
package main

import (
	"database/sql"
	"fmt"
)

// VULN: A03
func FindUser(db *sql.DB, name string) (*sql.Rows, error) {
	q := fmt.Sprintf("SELECT * FROM users WHERE name='%s'", name)
	return db.Query(q)
}
