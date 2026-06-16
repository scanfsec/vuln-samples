<?php
// A03 - Injection. VULN: SQLi + reflected XSS.
// VULN: A03 - SQL injection
function search($mysqli, $q) {
    return $mysqli->query("SELECT * FROM items WHERE title LIKE '%$q%'");
}

// VULN: A03 - XSS
function greet($name) {
    echo "<h1>Hello " . $name . "</h1>";
}
