#!/bin/bash

# Shell script to automate the code pushing to github.
while :
do
# git commands to push the code to github
    git add .
    git commit -a -m "All done for Day-11"
    git push
# Delay of 20 seconds for every push to github.
    sleep 20
done