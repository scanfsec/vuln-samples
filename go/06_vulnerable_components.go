// A06 - Vulnerable Components. VULN: go.mod pins with known CVEs.
/*
 * VULN: A06
 * require (
 *   github.com/gin-gonic/gin v1.3.0
 *   golang.org/x/crypto v0.0.0-20181108071528-e3df2e7401b0
 * )
 */
package main

func VulnerableComponents() {}
