♟️ Chess System Java
This is a console-based Chess game developed in Java, designed as an educational project to practice object-oriented programming concepts such as encapsulation, inheritance, polymorphism, and exception handling.

🚀 Project Overview
This project implements a complete chess system where two players can play against each other through the terminal. It handles all standard chess rules, including special moves (castling, en passant, pawn promotion), check, and checkmate detection.

The code is modular and well-structured, following a clear separation of concerns between a generic board system and chess-specific logic.

🏗️ Project Structure
css
Copiar
Editar
src/
├── application/
│   └── Program.java
├── boardgame/
│   ├── Board.java
│   ├── Piece.java
│   ├── Position.java
│   └── exceptions/
│       └── BoardException.java
└── chess/
    ├── ChessMatch.java
    ├── ChessPiece.java
    ├── ChessPosition.java
    ├── Color.java
    ├── pieces/
    │   ├── Bishop.java
    │   ├── King.java
    │   ├── Knight.java
    │   ├── Pawn.java
    │   ├── Queen.java
    │   └── Rook.java
⚙️ Main Components
boardgame package
Contains generic board-related classes that can be reused for other board games.

Board: Defines the board with a given number of rows and columns, manages the pieces.

Piece: Abstract class for generic pieces placed on the board.

Position: Represents a coordinate on the board (row and column).

BoardException: Custom exception class for invalid board operations.

chess package
Implements the specific chess logic.

ChessMatch: Controls the overall chess match, including turn handling, piece placement, move validation, check/checkmate logic, and special moves.

ChessPiece: Extends Piece, adding color and chess-specific behaviors.

ChessPosition: Represents positions using standard chess notation (e.g., a1, e4).

Color: Enum for piece colors (WHITE and BLACK).

pieces: Contains all chess pieces (King, Queen, Bishop, Knight, Rook, Pawn), each implementing its possible move logic.

application package
Contains the Program class, the entry point of the application.

Responsible for interacting with the user, reading input, printing the board, and coordinating moves.

💡 How It Works
1️⃣ When you run the program, it initializes a new ChessMatch with pieces set in their standard starting positions.

2️⃣ The board is printed to the console.

3️⃣ The user is prompted to enter the source and target positions for the piece they want to move (e.g., e2 to e4).

4️⃣ The system validates the move:

Checks if a piece exists at the source.

Verifies if the move is allowed according to chess rules.

Checks if the move would put or leave the king in check.

5️⃣ If valid, the piece is moved and the game state updates.

6️⃣ The game continues alternating turns between white and black until checkmate or draw.

🧩 Special Moves Implemented
✅ Castling
✅ En passant
✅ Pawn promotion
✅ Check and checkmate detection

🖥️ Console Output
The board is printed with different colors for white and black pieces, showing captured pieces and game status (check, checkmate, current turn).

🎯 Key OOP Concepts Applied
Encapsulation: Classes have well-defined responsibilities, with clear separation between board and chess logic.

Inheritance: Chess pieces inherit from a generic Piece class.

Polymorphism: Each chess piece implements its specific move logic.

Exception handling: Custom exceptions are used to handle invalid operations gracefully.

💬 How to Run
1️⃣ Clone the repository:

bash
Copiar
Editar
git clone https://github.com/yourusername/chess-system-java.git
2️⃣ Open in your favorite IDE (e.g., Eclipse, IntelliJ IDEA, VSCode).

3️⃣ Compile and run Program.java.
