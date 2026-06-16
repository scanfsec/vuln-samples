// A01 - Broken Access Control. VULN: missing ownership check on delete.
// VULN: A01 - IDOR delete
function deleteDocument(db, docId, userId) {
  return db.run(`DELETE FROM docs WHERE id = ${docId}`);
  // missing: AND owner_id = userId
}

module.exports = { deleteDocument };
