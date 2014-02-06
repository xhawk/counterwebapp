JRebel setup
============

1. Register at zeroturnaround.com
2. Maybe download the intellij idea plugin for jrebel
3. Setup maven-plugin for jrebel
4. Start the container with the webapp
5. In Intellij Idea turn 'make project automatically' on
6. Do code changes
7. Refresh
8. ...
9. Profit


Groovy with embedded jetty
==========================

1. ???
2. Run with command mvn jetty:run
3. Goto http://localhost:8080/welcome
4. Make changes to BaseControllerG.groovy and refresh page


Groovy with separate servlet container
======================================

1. Run 'npm install gulp -g'
2. Run 'npm install'
3. Change path in gulpfile.js to point to the servlet containers path
4. run 'gulp'
5. Make changes to groovy-file
6. ...
7. Profit
