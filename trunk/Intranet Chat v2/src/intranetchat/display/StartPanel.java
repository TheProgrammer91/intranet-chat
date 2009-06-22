/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package intranetchat.display;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Philip
 */
public class StartPanel extends JPanel{
    private Image img;

    /**
     * Main constructor for the aboutpanel
     */
    public StartPanel() {
        try{
          img = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("startup-logo.png"), "startup-logo.png"));
        }catch(Exception e){

        }
    }

    /**
     * Paints the image onto the panel
     * @param g Graphics
     */
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }




}