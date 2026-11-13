# Python fixture
FastAPI-style toy route. Cross-file flow: `routes.py` -> `service.py` -> `db.py`.
Expected: SQL injection; unsafe command construction; unsafe deserialization; path traversal.
