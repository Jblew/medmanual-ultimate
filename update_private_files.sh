#!/bin/bash

git checkout private
git merge master -m "Update to master"
git add .
git commit -m "Add private files to branch"
git checkout master
