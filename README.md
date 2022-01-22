<div align="center">

![license](https://img.shields.io/github/license/mohmorsi/Space-Byte?style=flat-square)
![made with heart by mohmorsi](https://img.shields.io/badge/made%20with%20%E2%9D%A4%EF%B8%8F%20by-mohmorsi-red?style=flat-square)
</div>

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
A *container*, simply put, packages up all the code and dependencies and places them into a "canister" such that the application can run smoothly on any computing environment. A **Docker container image** is a standalone executable that includes the application's code, system libraries, tools and its settings. Pretty neat!

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
<div align="center">
  
![](https://media.giphy.com/media/8TJTGD2PpTQ08oFl1D/giphy.gif)
</div>

## License
GPL-3.0 License

Copyright (c) 2021 Mohamed Morsi

## Contributors
Mohamed Morsi

## Questions
Contact me:

[![LinkedIn Badge](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mohamedammorsi)
[![Github Badge](https://img.shields.io/badge/Github-100000?style=for-the-badge&logo=github&logoColor=white)](https://www.github.com/mohmorsi)



