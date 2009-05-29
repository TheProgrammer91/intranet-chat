/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package intranetchat.core;


import intranetchat.display.About;
import intranetchat.display.MainDisplay;
import intranetchat.display.Preference;
import intranetchat.saving.SavedValues;
import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Observable;
import javax.swing.ImageIcon;

/**
 *
 * @author Philip
 */
public class Main {
    private MainDisplay display;
    private TrayIcon icon;
    SavedValues values;
    CheckboxMenuItem mute;

    public Main () {
        values = SavedValues.getInstance();
        values.importValues(SavedValues.DEFAULT_PATH);
        this.startTrayIcon();
        NetworkInterface network = NetworkInterface.getInstance();
        Observable obs = new NetworkListener();
        display = new MainDisplay(obs, network);
        (new Thread((NetworkListener)obs)).start();
        values.ValuesChanged();

    }

    private Image createImage(String path, String descrip) {
        URL url = Main.class.getResource(path);
        if(url != null){
            return(new ImageIcon(url, descrip)).getImage();
        }
        return null;
    }

    private void startTrayIcon(){
        if(!SystemTray.isSupported()){
            display.traySupported = false;
            return;
        }
        icon = new TrayIcon(createImage("icon.png", "tray icon"));
        PopupMenu menu = new PopupMenu();
        SystemTray tray = SystemTray.getSystemTray();

        MenuItem about = new MenuItem("About");
        MenuItem pref = new MenuItem("Preferences");
        MenuItem open = new MenuItem("Show Chat");
        MenuItem exit = new MenuItem("Quit");
        mute = new CheckboxMenuItem("Mute Sounds");
        if(!(values.soundEntrance || values.soundMessage)){
            mute.setState(false);
        }
        menu.add(open);
        menu.addSeparator();
        menu.add(about);
        menu.add(pref);
        menu.add(mute);
        menu.addSeparator();
        menu.add(exit);
        icon.setPopupMenu(menu);
        icon.setImageAutoSize(true);

        try{
            tray.add(icon);
        }catch(AWTException ex){
            return;
        }
        icon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                display.setVisible(true);
            }
        });

        open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                display.setVisible(true);
            }
        });

        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                About about = new About(null ,false);
            }
        });

        pref.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Preference prefs = new Preference(null, true);
            }
        });

        mute.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(mute.getState()){
                    values.soundEntrance = false;
                    values.soundMessage = false;
                }else{
                    values.soundEntrance = true;
                    values.soundMessage = true;
                }
            }
        });

        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                display.saving();
                System.exit(0);
            }
        });
        
    }

    public void run(){
        display.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}