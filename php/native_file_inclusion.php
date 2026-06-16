<?php
// Native: local / remote file inclusion. VULN: CWE-98
// VULN: LFI
function render_page($page) {
    include "pages/" . $page . ".php";
}

// VULN: RFI if allow_url_include On
function load_plugin($url) {
    include $url;
}
