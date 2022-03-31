import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SelectionWindow extends JFrame {
    private final int WIDTH = 500, HEIGHT = 600;
    JPanel panel;
    public SelectionWindow(){
        super();
        setTitle("Вход");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addWidgets();
        getContentPane().add(panel);
        pack();
        setLocation(300, 200);
    }

    private void addWidgets() {
        panel.setLayout(null);

        JLabel select = new JLabel("Выбирете действие");
        select.setBounds(200,150,200,40);
        panel.add(select);

        JButton play = new JButton("ИГРАТЬ");
        play.setBounds(130,200,100,30);
        play.addActionListener(e -> playClick(e));
        panel.add(play);

        JButton table = new JButton("ТАБЛИЦА");
        table.setBounds(280,200,100,30);
        panel.add(table);

        JButton back = new JButton("НАЗАД");
        back.setBounds(205,250,100,20);
        back.addActionListener(e -> backClick(e));
        panel.add(back);
    }

    private void playClick(ActionEvent e){
        PlayWindow window = new PlayWindow();
        setVisible(false);
        window.run();
    }

    private void backClick(ActionEvent e){
        AutorizationWindow window = new AutorizationWindow();
        setVisible(false);
        window.run();
    }

    public void run(){
        setVisible(true);
    }
}
