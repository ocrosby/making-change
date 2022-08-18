# Making Change

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