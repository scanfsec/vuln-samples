// A05 - Security Misconfiguration. VULN: pprof on public port, permissive TLS.
package main

import (
	_ "net/http/pprof"
	"net/http"
)

func misconfig() {
	// VULN: A05 - exposes pprof on 0.0.0.0
	go http.ListenAndServe(":6060", nil)
}
