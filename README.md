# simple-http-req-resp-boot
Simple boot app that on receipt of an HTTP GET, sleeps for a short duration, then logs the app latency time.

<p>
  Can test by curling the app like:
  <p>
  curl -X GET -H "X-Vcap-Request-Id: myid" --verbose https://simplereqresp.<Apps Route>
<p>
