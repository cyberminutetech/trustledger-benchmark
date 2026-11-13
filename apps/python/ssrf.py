import requests
def fetch_url(request):
    url = request.args.get("url")  # SOURCE
    # SINK: outbound request to user-controlled URL; SSRF validation required.
    return requests.get(url, timeout=3)
