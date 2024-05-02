# XML Validator
This is a Java console application that validates XML strings based on specific rules.

## Usage
To use the XML Validator, follow these steps:

Compile the Java files using the following command:
```bash
cd src
javac Main.java XMLValidator.java
```

Run the program with a valid XML string as an argument. For example:
```bash
java Main "<Design><Code>hello world</Code></Design>"
```
Run the program with an invalid XML string as an argument. For example:
```bash
java Main "<Design><Code>hello world</Code>"
```
This will validate the provided XML string and print either "Valid" or "Invalid" based on its validity.
Input Format
The XML string should be provided as the first command line argument when running the program. The string should be enclosed in double quotes if it contains spaces or special characters.

## Rules for Valid XML
The XML string is considered valid if it satisfies the following rules:

Each starting element must have a corresponding ending element.
Elements must be well nested, meaning that the element which starts first must end last.
Example
Consider the following example:

```bash
java Main "<Design><Code>hello world</Code></Design>"
```
#### This will output:
**Valid**

## Restrictions
This program does not use any classes from the System.XML package or regular expressions, as specified in the requirements.

## Tests 
I chose not to use any testing libraries in this project intentionally. It's to maintain simplicity and focus solely on the XML validation logic. By avoiding external dependencies, the code stays lightweight and easy to grasp.

Follow these instructions to test the code:

1- Open a terminal or command prompt and navigate to the directory.
```bash
cd src
javac TestXMLValidator.java XMLValidator.java
```
2- Run the test
```bash
java TestXMLValidator
```


## Author:
### Oshikawa Karla (押川　カルラ)
[GitHub](https://github.com/karlaoshikawa)

[Linkedin](https://www.linkedin.com/in/karlaoshikawa/)
