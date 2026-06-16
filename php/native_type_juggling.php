<?php
// Native: weak type comparison auth bypass. VULN: CWE-843
// VULN: magic hash / loose compare
function check_api_key($provided) {
    $secret = "0e462097431906509019562988736854";
    return $provided == $secret; // "0e123..." == "0e999..." → true
}
