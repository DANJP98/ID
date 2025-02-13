ID Number Validator

Description

This Java program validates an Israeli ID number by formatting it correctly and checking its validity using the official checksum algorithm.

Features

Accepts an input of up to 9 digits.

Ensures the ID is numeric and correctly formatted.

Validates the ID number using the checksum calculation.

How It Works

The program asks the user to enter an ID number (up to 9 digits).

It ensures only numeric input is accepted.

If the input is shorter than 9 digits, it pads it with leading zeros.

If the input is longer than 9 digits, it keeps only the last 9 digits.

The ID number is validated using a checksum algorithm:

Digits in odd positions remain unchanged.

Digits in even positions are doubled, and if the result is greater than 9, its digits are summed.

The total sum should be a multiple of 10 for the ID to be valid.

The program prints whether the ID is valid or not.

Files

ID.java - Main program that checks the ID validity.

DigitsCheck.java - Handles input validation and formatting.

Example Usage

Enter ID (up to 9 Digits): 12345678
Formatted ID: 012345678
Error: Invalid number!

How to Run

Compile the files:

javac ID.java DigitsCheck.java

Run the program:

java ID

Requirements

Java 8 or higher.

License

This project is open-source and available for use and modification.

