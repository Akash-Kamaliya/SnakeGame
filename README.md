# Snake Game (Java Swing)

A classic Snake Game built using Java Swing.\
This project includes smooth snake movement, food spawning, scoring, and
sound effects.

------------------------------------------------------------------------

## Project Structure

    SnakeGame/
    │
    ├── src/
    │   ├── SnakeGame.java
    │   ├── Board.java
    │   └── sound/
    │       └── gameOver.wav
    │
    └── README.md

------------------------------------------------------------------------

## How It Works

### **SnakeGame.java**

Creates the main window and loads the Board.

``` java
import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game");
        add(new Board());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
```

------------------------------------------------------------------------

### **Board.java**

Handles: - Snake movement\
- Food generation\
- Collision detection\
- Score\
- Key events\
- Game loop\
- Game Over sound


------------------------------------------------------------------------

## Sound

Place your sound file here:

    src/sound/gameOver.wav

------------------------------------------------------------------------

## Controls

  Key             Action
  --------------- ------------
  ⬆ Up Arrow      Move Up
  ⬇ Down Arrow    Move Down
  ⬅ Left Arrow    Move Left
  ➡ Right Arrow   Move Right

------------------------------------------------------------------------

## How to Run
-   Change Directory :

``` sh
cd SnakeGame\src
```
-   And Start The Game :
```sh
java SnakeGame.java
```

------------------------------------------------------------------------

## Features

-   Smooth snake movement\
-   Food spawning\
-   Score display\
-   Game Over sound effect\
-   Clean UI\
-   Works on Java 8+

------------------------------------------------------------------------

## Future Improvements

-   Background music\
-   Difficulty levels\
-   High score system\
-   Sprite-based graphics\
-   Pause/Resume
