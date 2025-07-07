♟️ Chess System Java

This is a console-based Chess game developed in Java, designed as an educational project to practice object-oriented programming concepts such as encapsulation, inheritance, polymorphism, and exception handling.

🚀 Project Overview

This project implements a complete chess system where two players can play against each other through the terminal. It handles all standard chess rules, including special moves (castling, en passant, pawn promotion), check, and checkmate detection.

The code is modular and well-structured, following a clear separation of concerns between a generic board system and chess-specific logic.

🏗️ Project Structure

css<br>
Copiar<br>
Editar<br>
src/<br>
├── application/<br>
│   └── Program.java<br>
├── boardgame/<br>
│   ├── Board.java<br>
│   ├── Piece.java<br>
│   ├── Position.java<br>
│   └── exceptions/<br>
│       └── BoardException.java<br>
└── chess/<br>   
    ├── ChessMatch.java<br>
    ├── ChessPiece.java<br>
    ├── ChessPosition.java<br>
    ├── Color.java<br>
    ├── pieces/<br>
    │   ├── Bishop.java<br>
    │   ├── King.java<br>
    │   ├── Knight.java<br>
    │   ├── Pawn.java<br>
    │   ├── Queen.java<br>
    │   └── Rook.java<br>
    
⚙️ Main Components

boardgame package

Contains generic board-related classes that can be reused for other board games.<br>
Board: Defines the board with a given number of rows and columns, manages the pieces.<br>
Piece: Abstract class for generic pieces placed on the board.<br>
Position: Represents a coordinate on the board (row and column).<br>
BoardException: Custom exception class for invalid board operations.<br>

chess package

Implements the specific chess logic.<br>
ChessMatch: Controls the overall chess match, including turn handling, piece placement, move validation, check/checkmate logic, and special moves.<br>
ChessPiece: Extends Piece, adding color and chess-specific behaviors.<br>
ChessPosition: Represents positions using standard chess notation (e.g., a1, e4).<br>
Color: Enum for piece colors (WHITE and BLACK).<br>
pieces: Contains all chess pieces (King, Queen, Bishop, Knight, Rook, Pawn), each implementing its possible move logic.<br>

application package

Contains the Program class, the entry point of the application.<br>
Responsible for interacting with the user, reading input, printing the board, and coordinating moves.

💡 How It Works

1️⃣ When you run the program, it initializes a new ChessMatch with pieces set in their standard starting positions.<br>
2️⃣ The board is printed to the console.<br>
3️⃣ The user is prompted to enter the source and target positions for the piece they want to move (e.g., e2 to e4).<br>
4️⃣ The system validates the move:

Checks if a piece exists at the source.<br>
Verifies if the move is allowed according to chess rules.<br>
Checks if the move would put or leave the king in check.<br>

5️⃣ If valid, the piece is moved and the game state updates.<br>
6️⃣ The game continues alternating turns between white and black until checkmate or draw.

🧩 Special Moves Implemented

✅ Castling<br>
✅ En passant<br>
✅ Pawn promotion<br>
✅ Check and checkmate detection

🖥️ Console Output

The board is printed with different colors for white and black pieces, showing captured pieces and game status (check, checkmate, current turn).

🎯 Key OOP Concepts Applied

Encapsulation: Classes have well-defined responsibilities, with clear separation between board and chess logic.

Inheritance: Chess pieces inherit from a generic Piece class.<br>
Polymorphism: Each chess piece implements its specific move logic.<br>
Exception handling: Custom exceptions are used to handle invalid operations gracefully.<br>

💬 How to Run

1️⃣ Clone the repository:<br>
bash<br>
Copiar<br>
Editar<br>
git clone https://github.com/yourusername/chess-system-java.git<br>
2️⃣ Open in your favorite IDE (e.g., Eclipse, IntelliJ IDEA, VSCode).<br>
3️⃣ Compile and run Program.java.
