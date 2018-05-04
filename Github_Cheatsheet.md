

git clone <url of our repository>				// adds a directory in the current folder for this project

git add fileNeedingUpdate1.java NewStuff1.java	// adds changes from specified files, delimited by a space

git add -a 										// adds all changes to list of things to be pushed

git commit -m "<message here>"					// commits current changes made using "git add"

git push 										// pushes all commits to current branch in remote repo

git pull 										// fetches and merges the remote repository with your local one

git fetch										// downloads current remote repository into temp memory

git merge										// automatically merges all changes in temp with your local

git checkout <branch>							// changes current working branch to one specified

git branch										// displays current branch and and a list of all branches

git branch <name>				// creates new branch with specified name e.g. ll-branch

Notes:
-In git commit: you need to have an -m followed by a message in quotes in order to push.
-If someone updates a branch before you've had a chance to push, you might
need to perform a git pull to merge the remote branch changes with your current
repository piror to pushing your changes.
-We probably won't be using fetch, just keep in mind fetching followed by a
git merge is the same thing as git pull.
