def preview_url(params)
  url = params[:url] # SOURCE
  # SINK: outbound HTTP request; validate scheme/host and resolved IP.
  Net::HTTP.get(URI(url))
end
