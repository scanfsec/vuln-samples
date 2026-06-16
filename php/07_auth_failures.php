<?php
// A07 - Auth Failures. VULN: session fixation + weak remember-me.
// VULN: A07
function login($user) {
    session_start();
    // VULN: accepts session id from client without regeneration
    $_SESSION['user'] = $user;
    setcookie('remember', base64_encode($user . ':password123'), time() + 86400 * 365);
}
