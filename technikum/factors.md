# Implementation of the 12 factors
## I. Codebase

This factor was achieved by pushing the codebase into a repository on GitHub ([Link to Repository](https://github.com/Philip95/technikum_se)).
Therefore, I have on codebase.

## II. Dependencies

Since I am using Spring for this exercise, all dependencies are managed in the build.gradle file, which results in an
isolation of the dependencies. Furthermore, the version of the dependencies can be managed easily.

## III. Config

For the config factor, I created an .env file, which I will also push to GitHub as a reference. Normally, I would never
push the .env file to Git. But since the file will be pretty much the same for all machines, I decided to leave it there
and to not create an example file, which you have to adapt. In this .env file I will write the config for the MySQL
container, such as user, password, connection string etc. 

## IV. Backing services

In this scenario I worked with a MySQL database. If you wish to switch database to another RDBMS (e.g. postgresql)
you can alter the docker-compose.yml easily. You just need to switch the image from MySQL to postgresql. The config would
be the same.


## V. Build, release, run

tbd

## VI. Processes

All data which needs to be stored is stored in the database. 
tbd

## VII. Port Binding

Ports bound through the docker-compose.yml file. Furthermore, the integrated Tomcat Server always listens to the 
port 8080. 

The database has the port 3306. Also, this is being set in the docker-compose.yml file.

## VIII. Concurrency

The exercise was to build a microservice. As far as I understand the factor it is about scaling the application into such 
pieces that the workload is not only on one process. So if, I want to build a larger application I could build more containers.

## IX. Disposability

In this case I dockerized the app. Therefore, it can be started, paused, stopped fast. 

## X. Dev/prod parity

Also in this case docker is helping a lot, since the goal of this factor is to close the gap between dev and prod 
environment. Since I declared everything in docker-compose.yml, the gap is being closed (I mean, I guess the gap will
never be closed, it would be a miracle, if two or more machines are totally equal, but in this case let's predict
that they are the same), because the same tools are being used. 

## XI. Logs

Logback was added to the application for writing the logs in a file named app.log. Unfortunately, Spring doesn't really 
write specific log files. Therefore, some config had to been made, which can be seen in the logback.xml file.

app.log will be generated, when a request 
is being sent. Since I don't want it to push to GitHub I added the file to the .gitignore. It is a very, very basic
config for Logback. I added some log statements throughout the code.

## XII. Admin processes

tbd