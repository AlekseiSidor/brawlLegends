import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel {
    Player player;
    Player2 player2;
    Patron patron;
    Patron patron2;
    public MyPanel(){
        player = new Player();
        player2 = new Player2();
        patron = new Patron();
        patron2 = new Patron();
    }

    public void control_player(KeyEvent e) {
        int code = e.getKeyCode();
        switch (e.getKeyCode()) {
            case 87:if(player.getY() > 20)
                player.stepUp();
                break;
            case 83:if (player.getY() < 620)
                player.stepDown();
                break;
        }
        repaint();
    }

    public void control_player1(KeyEvent e) {
        int code = e.getKeyCode();
        switch (e.getKeyCode()) {
            case 38:if(player2.getY() > 20)
                player2.stepUp();
                break;
            case 40:if (player2.getY() < 620)
                player2.stepDown();
                break;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0,0,1000,20);
        g.fillRect(0,0,20,700);
        g.fillRect(0,680,1000,20);
        g.fillRect(980,0,20,700);
        g.fillRect(490,0,20,700);
        player.draw(g);
        player2.draw(g);
        patron.draw(g);
        patron2.draw1(g);
    }
}
