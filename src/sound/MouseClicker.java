
package sound;
import javax.swing.*;
import java.net.*;
import java.applet.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

        
public class MouseClicker extends JFrame{
    
    AudioClip click;
    
    public static void main(String[] args) {
        new MouseClicker();
    }
    
    //This gets the sound file
    public MouseClicker(){
        this.setSize(400,400);
        this.setTitle("Mouse Clicker");
        this.addMouseListener(new Clicker());
        
        URL urlClick = MouseClicker.class.getResource("sea.wav");
        click=Applet.newAudioClip(urlClick);
        
        this.setVisible(true);
        
    }
    private class Clicker extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            click.play();
        }
    }
    

}


