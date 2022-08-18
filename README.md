# Making Change

## Problem Statement

Write code that gives exact change with the least number of coins for a given number of cents. Use intermediate variables to help your calculation. 

Note: Test with different numbers (not just 137)!

## Setup

I assume the Java SDK has already been installed and you have access to it in the PATH.

## Install Maven

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