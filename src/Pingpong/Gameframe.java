package Pingpong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Gameframe extends JFrame {
    Gamepanel panel;
    Gameframe(){
        panel = new Gamepanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        // צבע למסך
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        //מסך היציאה יופיע באמצע
        this.setLocationRelativeTo(null);
    }
}
