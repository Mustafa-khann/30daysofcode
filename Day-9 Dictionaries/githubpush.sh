#!/bin/bash

# Shell script to automate the code pushing to github.
while :
do
# DELAY OF 2 MINUTES FOR EVERY PUSH IN THE INFINITE LOOP
    sleep 120
# COMMANDS TO PUSH THE CODE TO GITHUB
    git add .
    git commit -a -m "All done for Day-9"
    git push
done