package main.java.GemTFree.Gui;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class MapGUI extends JPanel {
    
    public MapGUI(){
        setSize(800, 800);
        drawMap();
    }
    
    public void drawMap(){
        JPanel map = new JPanel(new GridLayout(10,10));
        map.setSize(800, 800);
        for(int i = 0; i < 10*10; i++){
            map.add(new Button("" + i));
        }
        add(map);
    }
    
}
