# Test Matrix

| Feature | Primary fixture | Expected evidence |
|---|---|---|
| 10 language parsing | `apps/*` | Language, file, symbol inventory |
| Cross-file taint | `traces/canonical-traces.json` | Full source-to-sink path |
| SQL injection | language `*Service*`, `*Repository*`, `store.*`, `db.py` | Source + SQL sink |
| XSS / template | JS, PHP, C#, Kotlin, TS | Output context and encoding |
| Command injection | Go, Rust, Python | Tainted command argument |
| Path traversal | Python export path | Canonical path boundary |
| Deserialization | Python pickle, Java ObjectInputStream | Untrusted bytes to loader |
| SSRF | Python `ssrf.py`, Ruby `ssrf.rb` | User URL to HTTP client |
| Open redirect | JS `redirect.js`, PHP `redirect.php` | User URL to redirect |
| Weak TLS | Go `tls.go` | Disabled certificate validation |
| Weak crypto | C# `crypto.cs`, Rust `unsafe_crypto.rs` | Algorithm and context |
| Webhook trust | TypeScript `webhook.ts`, API inventory | Missing signature verification |
| Secrets | `secrets/fake-secrets.env` | Type, line, confidence; fake-only warning |
| Dependency reachability | `dependencies/*` | Component, advisory source, call path |
| API auth gaps | `api-inventory/routes.json` | Sensitive route lacking auth |
| Shadow AI | `shadow-ai/observations.json` | Confidence and policy status |
| Compliance | `compliance/control-mapping.json` | Control-to-evidence linkage |
| SLA | `sla/policies.json` | On track / at risk / overdue |
| Risk register | `risk-register/register.json` | CWE, owner, reviewer, deadline |
| Audit | `audit/events.jsonl` | Event chronology and integrity metadata |
| Reports | `reports/*` | SPDX and CycloneDX output |
| Threats | `threats/threat-feed.json` | Pattern, linked risk, SLA |

## Required negative tests

- Parameterized SQL examples in each applicable language should not trigger SQL injection.
- Safe encoding should suppress XSS only when the encoding is correct for the output context.
- A dependency with no reachable vulnerable call should not be labelled exploitable.
- Public health endpoints should not be flagged as missing authentication solely because they are public.
- The synthetic audit hash placeholders must not be treated as valid signatures.
- Shadow AI confidence must remain probabilistic and explainable.
