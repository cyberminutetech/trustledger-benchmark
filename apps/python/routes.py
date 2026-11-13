from service import lookup_user, export_report, load_profile

def get_user(request):
    user_id = request.query_params.get("id")  # SOURCE: HTTP query
    return lookup_user(user_id)

def download(request):
    name = request.query_params.get("name")   # SOURCE: HTTP query
    return export_report(name)

def import_profile(request):
    raw = request.body
    return load_profile(raw)
