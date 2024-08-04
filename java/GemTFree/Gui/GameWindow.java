package main.java.GemTFree.Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
    
    public GameWindow(){
        testSetup();
        setSize(200,200);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void testSetup(){
        JPanel startGamePanel = new JPanel();
        startGamePanel.setSize(new Dimension(200,200));
        JButton startGameButton = new JButton();
        startGamePanel.add(startGameButton);

        startGameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changeWindow();
            }
        });

        add(startGamePanel);

    }

    private void changeWindow(){
        remove(getGlassPane());
        setGlassPane(new JPanel(200,200){
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.drawRect(0, 0, 200, 200);
            }
        });
    }

}
