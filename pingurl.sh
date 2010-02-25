#!/bin/sh

while [ 1 ]
do
  curl http://spinup-check-simple.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping simple end.'
  curl http://spinup-check-slim3.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping slim3 end.'
  sleep 180
done

