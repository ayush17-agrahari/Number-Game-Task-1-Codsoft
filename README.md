# Number-Game-Task-1-Codsoft
A simple console-based Number Guessing Game built using Java. This project was developed as part of the CodSoft Internship Program, and it demonstrates the use of core Java concepts such as loops, conditionals, random number generation, input handling, and basic game logic.

📌 Features
✅ Random number generation between 1 and 100

🔢 User inputs guesses with real-time feedback: "Too high", "Too low", or "Correct"

🎯 Limited number of attempts per round

🔁 Multiple rounds support

🏆 Scoring system based on correct guesses

🧠 Input validation to avoid crashes

📁 Project Structure
bash
Copy
Edit
NumberGuessingGame/
│
├── NumberGuessingGame.java   # Main Java file with game logic
├── README.md                 # Project description

🧠 Concepts Used
Random class for number generation

Scanner for user input

Conditional statements (if-else)

Loops (while, do-while)

Functions/methods for clean structure

Basic user interface in the console

OUTPUT:
Welcome to the Number Guessing Game!
How many rounds would you like to play? 4

? Round 1 begins!
Enter your guess (1?100): 50
? Too low!
Attempts left: 6
Enter your guess (1?100): 60
? Too high!
Attempts left: 5
Enter your guess (1?100): 69
? Too high!
Attempts left: 4
Enter your guess (1?100): 80
? Too high!
Attempts left: 3
Enter your guess (1?100): 40
? Too low!
Attempts left: 2
Enter your guess (1?100): 35
? Too low!
Attempts left: 1
Enter your guess (1?100): 90
? Too high!
Attempts left: 0
? You're out of attempts! The correct number was 53.
