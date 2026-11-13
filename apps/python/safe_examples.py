def safe_user_lookup(cursor, user_id):
    # NEGATIVE: parameterized query; must not be reported as SQL injection.
    return cursor.execute("SELECT * FROM users WHERE id = %s", (user_id,))

def safe_html(escape, value):
    # NEGATIVE only if the engine knows this is context-appropriate HTML escaping.
    return escape(value)
