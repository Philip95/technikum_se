# Implementation of the 12 factors
## I. Codebase

This factor was achieved by pushing the codebase into a repository on GitHub ([Link to Repository](https://github.com/Philip95/technikum_se)).
Therefore, I have on codebase.

## II. Dependencies

Since I am using Spring for this exercise, all dependencies are managed in the build.gradle file, which results in an
isolation of the dependencies. Furthermore, the version of the dependencies can be managed easily.

## III. Config

For the config factor, I wanted to create environment variables, but it didn't quite work out.
So I tried to solve this twelve factor part, but was failing on the way.


## IV. Backing services

In this scenario I worked with a MySQL database. If you wish to switch database to another RDBMS (e.g. postgresql)
you can alter the docker-compose.yml easily. You just need to switch the image from MySQL to postgresql. The config would
be the same.


## V. Build, release, run

Basically this point is achieved with using Docker to build images from the source code. After building the image 
it will be pushed with a tag. In my case it was 'latest'. In a last step the image can be pulled from the registry and
run as a container.

## VI. Processes

All data which needs to be stored is stored in the database. 
There are no sticky sessions in the code. 

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

I am not quite sure, if I understood this right, but I designed a REST API where a user can send requests to. So they can
check for specific jobs by searching after an ID or delete a job and inserting new jobs. In this case, they are random, 
but of course it could be possible to extend the application such that one can send an Excel file or something similar. 