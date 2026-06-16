// A04 - Insecure Design. VULN: race on balance transfer without locking.
package main

var balance int

// VULN: A04 - TOCTOU / no transaction
func Transfer(amount int) {
	if balance >= amount {
		// attacker can double-spend between check and deduct
		balance -= amount
	}
}
