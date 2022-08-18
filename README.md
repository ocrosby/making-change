# Making Change

## Problem Statement

Write code that gives exact change with the least number of coins for a given number of cents. Use intermediate variables to help your calculation. 

Note: Test with different numbers (not just 137)!

## Setup

I assume the Java SDK has already been installed and you have access to it in the PATH.  Otherwise you can [download the version for your system here](https://www.oracle.com/java/technologies/downloads/) and follow the [setup instructions](https://docs.oracle.com/en/java/javase/18/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A).

## Install Maven

The installation instructions for Apache's Maven [can be accessed here](https://maven.apache.org/install.html).  If you are on a MAC and use homebrew you can execute the following.

```bash
brew install maven
```

## Building

```bash
mvn clean
mvn build
mvn package
```

## Testing

```bash
mvn test
```

## Running

You can run the program by executing the run.sh shell script as follows, or by executing the command in the script directly.

```bash
chmod +x ./run.sh
./run.sh
```

The output should be as expected:

```bash
Part 2: Making Change

137 cents:
5 quarters, 1 dimes, 0 nickels, 2 pennies

100 cents
4 quarters, 0 dimes, 0 nickels, 0 pennies
```

To see the values I tested take a look at the [tests](https://github.com/ocrosby/making-change/blob/main/src/test/java/com/denmark/ChangeMakerTest.java).