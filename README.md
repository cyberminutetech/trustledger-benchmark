# TrustLedger Enterprise Security Benchmark

A deliberately vulnerable, synthetic multi-language benchmark repository for validating TrustLedger's
SAST, secrets, dependency, API security, compliance evidence, audit, trace, threat and reporting workflows.

**Languages:** Go, C#, PHP, Kotlin, Ruby, Rust, Java, Python, JavaScript, TypeScript.

**Safety:** This repository contains intentionally insecure toy applications and fake credentials.
Run only locally in an isolated environment. Do not deploy these applications or reuse any credentials.
No real secrets, production services, or destructive payloads are included.

## What this benchmark covers

| Product area | Fixture coverage |
|---|---|
| Overview / org health | `benchmark/manifest.json`, `benchmark/expected-findings.json` |
| Analytics | `benchmark/scan-events.jsonl`, `benchmark/analytics/` |
| TrustScore | `benchmark/trustscore-input.json` |
| Compliance | `compliance/` with SOC 2, EU AI Act and PCI-DSS illustrative mappings |
| SLA Dashboard | `sla/` |
| Risk Register | `risk-register/` |
| Scan History / Code Risk | all language fixtures + `traces/` |
| Secrets | `secrets/` |
| Dependencies | `dependencies/` |
| API Security | `api-inventory/` |
| Shadow AI | `shadow-ai/` |
| Audit Trail | `audit/` |
| Reports / SBOM | `reports/` |
| Trace | `traces/` |
| Rule Catalog | `rules/` |
| Threats | `threats/` |

## Layout

- `apps/<language>/` — small intentionally vulnerable application split across files.
- `benchmark/` — manifest, expected finding catalogue, synthetic scan events and score inputs.
- `rules/` — rule catalogue with CWE, source/sink, expected evidence and remediation.
- `traces/` — canonical source-to-sink trace expectations.
- `secrets/` — fake credential fixtures and detection expectations.
- `dependencies/` — sample manifests and synthetic reachability/CVE fixtures.
- `api-inventory/` — endpoint inventory with deliberately inconsistent authorization.
- `compliance/` — illustrative control-to-evidence mappings (not legal advice or certification).
- `sla/`, `risk-register/`, `audit/`, `reports/`, `shadow-ai/`, `threats/` — product dashboard data fixtures.

## Suggested scanner workflow

1. Import this repository as one organization/repository.
2. Run a full scan and verify language detection for all ten languages.
3. Check per-file findings and source-to-sink traces.
4. Validate cross-file propagation and sanitizer negative cases.
5. Run secrets and dependency scans.
6. Generate endpoint inventory and compare protected/unprotected sibling routes.
7. Inspect compliance mappings, SLA status, risk register and audit events.
8. Generate SPDX and CycloneDX SBOMs; compare against `reports/expected-sbom-components.json`.
9. Compare results against `benchmark/expected-findings.json`.

## Expected benchmark design

This is a **fixture suite**, not a claim that every SAST product must detect every item.
Expected findings are labelled `must_detect`, `should_detect`, or `informational`.
A result should be marked confirmed only when the scanner can show concrete evidence and a valid
source-to-sink path. Do not infer exploitability solely from a matching API name.

## Run locally

Each app is intentionally small and may require its language runtime/framework to build. Most
fixtures can be statically scanned without installing dependencies. See `apps/<language>/README.md`.

## Important
- All credentials are fabricated placeholders such as `FAKE_*`.
- CVE identifiers and package versions in `dependencies/` are synthetic benchmark metadata where
  explicitly marked. Do not treat them as live vulnerability intelligence.
- Compliance mappings are illustrative crosswalks, not auditor-approved interpretations.
