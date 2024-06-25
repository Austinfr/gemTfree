package GemTFree;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.*;

public class MapGUI extends JFrame {
    
    public MapGUI(){
        setSize(800, 800);
        drawMap();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
