#!/bin/bash

git add .
git commit -m "Update privates"
git checkout private
git merge master -m "Update to master"
git add .
git commit -m "Add private files to branch"
git symbolic-ref HEAD refs/heads/master
git reset
cat >.gitignore <<EOL
target/
bin/
latest.jar
*.jpg
*.jpeg
*.png
*.pdf 
EOL
