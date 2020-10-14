# Containerizing a Java Application into a Docker Image

![image](./img/docker2.png)

## Table of Contents
* [Introduction](#introduction) 
* [Demo](#demo)
* [Usage](#usage)
* [Installation](#installation)
* [Usage](#usage)
* [License](#license)
* [Contributors](#contributors)
* [Questions](#questions)


## Introduction
A *container* simply put packages up all the code and dependencies in order in a "canister", in order for the application to run smoothly in any computing environment. A **Docker container image** is a standalone executable that includes the application's code, system libraries and tools as well as its settings. Pretty neat!

## Demo
![](https://media.giphy.com/media/3OiKrJsfDiqqBL8pX3/giphy.gif)

## Usage
For this demonstration, I will be using a simple Java application named `Account.java` that creates two bank account objects and then sets and prints their balances.

1. Navigate to the folder containing the Java application and compile it:

![](https://i.postimg.cc/k5kG72Ft/javac.png)

2. Run the java program to verify that it works

![](https://i.postimg.cc/ZnL5PVkr/java.png)

Using vi or vim, whichever you choose, create a docker file that will containerize the java application. In this project I used Alpine Linux which is a very light-weight distro of Linux that is only 5MB in size. This makes it great to containerize `Account.java`.



## License

## Contributors

## Questions
Contact me:

Github: [https://github.com/mohmorsi](https://github.com/mohmorsi)




