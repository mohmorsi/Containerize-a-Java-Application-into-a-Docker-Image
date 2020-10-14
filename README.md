# Containerizing a Java Application into a Docker Image

![image](./img/docker2.png)

## Table of Contents
* [Introduction](#introduction) 
* [Demo](#demo)
* [Usage](#usage)
* [License](#license)
* [Contributors](#contributors)
* [Questions](#questions)


## Introduction
A *container* simply put packages up all the code and dependencies in order in a "canister", in order for the application to run smoothly in any computing environment. A **Docker container image** is a standalone executable that includes the application's code, system libraries and tools as well as its settings. Pretty neat!

## Usage
For this demonstration, I will be using a simple Java application named `Account.java` that creates two bank account objects and then sets and prints their balances.

1. Navigate to the folder containing the Java application and compile it:

`javac Account.java`

2. Run the java program to verify that it works

`java Account.java`

Using vi or vim, whichever you choose, create a docker file that will containerize the java application. In this project I used Alpine Linux which is a very light-weight distro of Linux that is only 5MB in size. This makes it great to containerize `Account.java`.

Define a working directory using the shell command `WORKDIR /root/Account` for the Java program and then move Java application over into the directory by using the command `COPY Account.java /root/Account` 

I installed OpenJDK on Alpine Linux as it is not pre-installed. Run the alpine package manager using the command `RUN apk add openjdk8` and then setup the environment variables using the commands `ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk`,`ENV PATH $PATH:$JAVA_HOME/bin`

Finally, run the Java application using the command `RUN javac Account.java` and setup an entry point `ENTRYPOINT java Account`. 

## Demo
<img src="https://media.giphy.com/media/3OiKrJsfDiqqBL8pX3/giphy.gif" width="630" height="415" />

## License
Morsi 
## Contributors
Mohamed Morsi
## Questions
Contact me:

Github: [https://github.com/mohmorsi](https://github.com/mohmorsi)




