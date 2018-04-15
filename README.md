# SpringBoot H2 In memory Db with JPA and RestController

A sample app that shows how to use an H2 in memory database within a springboot application. 
The setup is really simple made possible with JPA and H2.
I have build in a RestController to access the data.
The data itself is stored in a sql file that is populated on start up.

# Why?
I built this app to help testers manage their test-data as this is a common problem in our scope. 
This is part 1 of 3 that will show how use a central test-data factory to test in code system tests as well as functional tests later on.

## How to use this application.

Open it up and hit the play button or just run from command line! 

### Access the Db
Upon start up your database is setup and preloaded!
H2 provides a web form to access the database visually, simply navigate to #http://localhost:8080/h2-console to access the form,
and use jdbc:h2:mem:testdb as the JDBC URL.

You will find a Student table with 2 entries in it.

### To access the API's - 
To access the API's simply navigate to 
http://localhost:8080/students/ - this will provide a list of students.

http://localhost:8080/students/id/{id} - this will provide a unique student based in the Id you have entered.

## Disclaimer
I did not bother with error handling on the API, so if you muck up there expect to see a 400!
