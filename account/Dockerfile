# Linux image we are going to use
FROM alpine
WORKDIR /root/Account
COPY Account.java /root/Account

# Install JDK
RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

# Compile Account
RUN javac Account.java

ENTRYPOINT java Account
