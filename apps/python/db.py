import pickle

def run_query(sql):
    # SINK: SQL execution; query string is constructed by caller.
    return database.execute(sql)  # noqa: F821

def write_report(path):
    # SINK: file write; caller-controlled path reaches filesystem.
    with open(path, "w") as handle:
        handle.write("synthetic report")

def deserialize_profile(raw):
    # SINK: unsafe pickle deserialization.
    return pickle.loads(raw)
