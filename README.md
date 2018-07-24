For upload Project

1)git init 

2) git add. 

3) git commit -m "Add all my files" 

4) git remote add origin <path>https://github.com/Tamil-10/izoom_backup.git

5) git pull origin master 

6) git push origin master or git push --force origin master


https://i.stack.imgur.com/srvcn.png


for update

    git init
 
    git add .
    
    git commit -m "my commit"
    
    git remote add origin <remote repository URL>
    
    git push origin master
 
 ---------------------------------------------------------------------
update
-------
git add .
git commit -m 'whatever msg'
git push origin master 
    
-------------------------------------------------------------------------
.gitignore
------------

create a text file

rename git.txt .gitignore

in .gitignore file 
# dependencies 
/node_modules


# misc
/.sass-cache
/connect.lock
/coverage
/libpeerconnection.log

Then in your git bash you have to write the following line:

git config --global core.excludesfile ~/.gitignore_global
If the respository already exists then you have to do the following:

1)git rm -r --cached .
2)git add .
3)git commit -m ".gitignore is now working"
