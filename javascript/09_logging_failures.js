// A09 - Logging Failures. VULN: no audit trail for privilege changes.
// VULN: A09 - silent role escalation
function promoteUser(db, userId, role) {
  db.run(`UPDATE users SET role='${role}' WHERE id=${userId}`);
  // no security log, no alert
}

module.exports = { promoteUser };
