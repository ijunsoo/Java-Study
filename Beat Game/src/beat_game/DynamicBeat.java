package beat_game;

import javax.swing.*;
import java.awt.*;

public class DynamicBeat extends JFrame {
    private Image Screen_Image;
    private Graphics Screen_Graphics;
    private Image introBackground;
    public DynamicBeat(){
        setTitle("BeatGame");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        introBackground= new ImageIcon(Main.class.getResource("images/introBackground.jpg")).getImage();
    }
    public void paint(Graphics g){
        Screen_Image=createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        Screen_Graphics=Screen_Image.getGraphics();
        Screen_Draw(Screen_Graphics);
        g.drawImage(Screen_Image,0,0,null);
    }
    public void Screen_Draw(Graphics g){
        g.drawImage(introBackground,0,0,null);
        this.repaint();
    }
}
