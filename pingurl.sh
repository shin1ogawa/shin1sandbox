#!/bin/sh

a=50

while [ $a -gt 0 ]
do
  curl http://spinup-check-simple.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping simple end.'
  curl http://spinup-check-slim3.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping slim3 end.'
  curl http://spinup-check-t2.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping t2 end.'
  curl http://spinup-check-python.latest.my-stream.appspot.com/ > /dev/null
  echo 'ping python end.'
  a=`expr $a - 1`
  echo $a
  sleep 360
done

