import javax.swing.*;

public class SnakeGame extends JFrame{

    ImageIcon logo = new ImageIcon(getClass().getResource("/icons/Snake.png"));

    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();

        setIconImage(logo.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
            new SnakeGame().setVisible(true);
    }
}