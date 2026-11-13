from db import run_query, write_report, deserialize_profile
import os

def lookup_user(user_id):
    # Cross-file propagation: route parameter -> service -> database sink
    return run_query("SELECT * FROM users WHERE id = '" + str(user_id) + "'")

def export_report(name):
    # Cross-file propagation: route parameter -> service -> filesystem sink
    return write_report("/srv/reports/" + name)

def load_profile(raw):
    # Unsafe deserialization sink; fixture intentionally uses pickle.
    return deserialize_profile(raw)

def ping(host):
    # Command injection sink
    os.system("ping -c 1 " + host)
