# 🎯 Number Guessing Game

A simple **Java console-based number guessing game** where the player tries to guess a randomly generated number between **1 and 100**.

The game guides the player with hints, validates their input, keeps track of attempts, and allows them to play multiple rounds.

## ✨ Features

* 🎲 Randomly generates a number between **1 and 100**
* 🔼 Gives a **"Try higher"** hint when the guess is too low
* 🔽 Gives a **"Try lower"** hint when the guess is too high
* 🔢 Tracks the number of attempts
* 🛡️ Handles invalid inputs using exception handling
* ✅ Validates guesses within the **1–100** range
* 🔄 Supports replaying the game
* ✔️ Validates `y/n` input for replay

## 🛠️ Concepts Used

* Java basics
* `Scanner`
* `Random`
* `while` loops
* `if-else` conditions
* `try-catch`
* `InputMismatchException`
* Input validation
* Variables and counters

## 🎮 How to Play

1. Run the program.
2. Enter a number between **1 and 100**.
3. Use the hints to adjust your next guess.
4. Keep guessing until you find the correct number.
5. Check how many attempts you took.
6. Choose whether to play again.

## 💻 Sample Output

```text
Enter a number between 1 and 100: 40
40 is lower than the number! Try higher -> 70
70 is higher than the number! Try lower -> 55
55 is lower than the number! Try higher -> 62

Hurray! you guessed it right in 4 attempts

Wanna play again(y/n) -> n
```

## 📌 Project Overview

This project was built to practice **Java fundamentals, loops, conditional logic, exception handling, and input validation** while creating a small interactive console application.
