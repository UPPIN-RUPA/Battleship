# Battleship Game

This is a console-based implementation of the classic Battleship game in Java. The game is designed for two players: one human player and one computer player. Players must strategically place ships on a board and try to sink the opponent's ships before their own ships are sunk.

## Table of Contents
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Game Rules](#game-rules)
- [Features](#features)
- [Future Improvements](#future-improvements)
- [License](#license)
- [Author](#author)
- [Acknowledgments](#acknowledgments)

## Project Structure

The project consists of the following Java files:

- **Battleship.java**: The main file to run the game. It initializes the game and manages the flow between the player and the computer.
- **Boards.java**: Handles the creation and display of the game boards. It manages both the player's and the computer's boards, updating them as ships are placed or attacked.
- **Computer.java**: Represents the computer player. It handles the logic for the computer’s moves and ship placements.
- **Coordinate.java**: A helper class used to manage coordinates on the board. It encapsulates the row and column for easier manipulation and validation.
- **Player.java**: Represents the human player. This file contains the logic for handling the player's moves and input.
- **Sample.java**: Contains sample methods and classes that may be used across the project. It provides reusable utilities for game functionality.
- **Ship.java**: Manages ship properties, such as size, orientation, and position on the board.

## How to Run

To run the Battleship game:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/UPPIN-RUPA/Battleship.git
   cd Battleship
   
## Game Rules

1. **Setup**:
   - Both the player and the computer have a grid on which they will place ships.
   - The goal is to sink all of the opponent's ships by guessing their locations.

2. **Gameplay**:
   - The player and the computer take turns guessing the coordinates of the opponent’s ships.
   - If a ship is hit, the board will mark that position, and the player gets another turn.
   - If a guess misses, the turn passes to the other player.
   - The game continues until one player sinks all of the opponent's ships.

## Features

- **Computer AI**: The computer makes random guesses to try and sink the player’s ships.
- **Coordinate Validation**: Ensures that player inputs are within the bounds of the board.
- **User-friendly Console Output**: Provides clear feedback on the current state of the game board.

## Future Improvements

- Add a graphical user interface (GUI) for enhanced user experience.
- Implement different difficulty levels for the computer AI.
- Add support for multiplayer mode over a network.

## Author

Rupa Uppin
   
