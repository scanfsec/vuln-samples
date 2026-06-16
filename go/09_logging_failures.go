// A09 - Logging Failures. VULN: no structured security audit log.
package main

import "log"

// VULN: A09 - failed admin actions not logged
func SetRole(userID, role string) {
	log.Printf("role change %s -> %s", userID, role) // no severity, no alert
}
