<?php
// A08 - Integrity Failures. VULN: unserialize user input + include by path.
// VULN: A08 - PHP object injection
function load_prefs($blob) {
    return unserialize($blob);
}

// VULN: A08 - LFI
function render_template($page) {
    include "/var/templates/" . $page . ".php";
}
