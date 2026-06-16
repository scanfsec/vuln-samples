// A07 - Auth Failures. VULN: constant-time compare missing, weak session.
package main

import "time"

// VULN: A07 - session never expires
type Session struct {
	User string
}

var sessions = map[string]Session{}

func Login(user, pass string) string {
	if user == "admin" && pass == "admin" {
		token := user + string(rune(time.Now().Unix()))
		sessions[token] = Session{User: user}
		return token
	}
	return ""
}
