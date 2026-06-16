// Native: data race on shared map. VULN: CWE-362
package main

var cache = map[string]int{}

// VULN: concurrent map read/write without mutex
func Set(key string, val int) { cache[key] = val }
func Get(key string) int       { return cache[key] }
