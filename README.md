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


--------------------------------------------------------------
Java Config
-------

Environment variables
classpath  -  %m2_home%/lib;%java_home%/lib
java_home  -  C:\Program Files\Java\jdk1.8.0_92
m2_home    -  D:\software\apache-maven-3.5.4
MAVEN_HOME -  D:\software\apache-maven-3.5.4
PATH       - C:\Users\NVS005\AppData\Local\Programs\Python\Python37\Scripts\;C:\Users\NVS005\AppData\Local\Programs\Python\Python37\;D:\software\apache-maven-3.5.4\bin;C:\Program Files\Java\jdk1.8.0_92\bin;C:\Program Files (x86)\Microsoft VS Code;D:\xdotool-for-windows\_bin\xdotool.exe;C:\Users\NVS005\AppData\Local\Programs\Python\Python37\chromedriver.exe;C:\PhantomJs\bin\phantomjs\C:\PhantomJs\bin\phantomjs\bin


Path       -  D:\app\NVS005\product\11.2.0\dbhome_2\bin;%SystemRoot%\system32;%SystemRoot%;%SystemRoot%\system32\Wbem;C:\ProgramData\Oracle\Java\javapath;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\;C:\Program Files\nodejs\;C:\Program Files\Git\cmd;%M2_HOME%\bin;C:\Program Files (x86)\Windows Kits\8.1\Windows Performance Toolkit\;%path%;C:\Program Files (x86)\Microsoft VS Code;D:\phantomjs-2.1.1-windows\bin;


