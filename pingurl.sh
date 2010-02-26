#!/bin/sh

while [ 1 ]
do
  curl http://spinup-check-simple.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping simple end.'
  curl http://spinup-check-slim3.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping slim3 end.'
  curl http://spinup-check-t2.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping t2 end.'
  sleep 300
done

