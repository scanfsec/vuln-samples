// A05 - Security Misconfiguration. VULN: exposes /debug and disables helmet.
// VULN: A05 - verbose errors, open admin route
function createApp(express) {
  const app = express();
  app.disable("x-powered-by"); // only cosmetic
  app.get("/debug/env", (_, res) => res.json(process.env)); // VULN
  app.use((err, _req, res, _next) => res.status(500).send(err.stack)); // VULN
  return app;
}

module.exports = { createApp };
