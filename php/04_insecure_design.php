<?php
// A04 - Insecure Design. VULN: CAPTCHA always passes.
// VULN: A04 - bot protection bypass by design
function verify_captcha($answer) {
    return true;
}

function register_user($email, $password) {
    if (!verify_captcha($_POST['captcha'])) return false;
    // ...
    return true;
}
